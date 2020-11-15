package com.gchsj.board.domain;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    private String id;
    private String title;
    private String content;
}
