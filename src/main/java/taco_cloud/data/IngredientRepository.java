package taco_cloud.data;

import org.springframework.data.repository.CrudRepository;

import taco_cloud.Ingredient;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}
