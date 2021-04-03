package be.recipe.recipe.commands;

import be.recipe.recipe.domain.Recipe;
import be.recipe.recipe.domain.UnitOfMeasure;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {
    private Long id;
    private Long recipeId;
    private String description;
    private BigDecimal amount;
    private Recipe recipe;
    private UnitOfMeasureCommand uom;

}
