package com.abnamro.recipes.model;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class Recipes {
    String title;
    String href;
    List<String> ingredients;
    String thumbnail;
}
