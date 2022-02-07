package ru.spring.learn;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FirstComponent {

    private final InnerComponent innerComponent;

}
