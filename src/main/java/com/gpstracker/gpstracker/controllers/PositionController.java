package com.gpstracker.gpstracker.controllers;

import com.gpstracker.gpstracker.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class PositionController {
    @Autowired
    private PositionRepository positionRepository;

    @GetMapping
    public ModelAndView listPositions() {
        var positions = this.positionRepository.findAll(Sort.by(Sort.Direction.DESC, "datetime"))
                                                    .stream()
                                                    .map(PositionItemDto::new)
                                                    .collect(Collectors.toList());
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("positions", positions);
        return mv;
    }
}
