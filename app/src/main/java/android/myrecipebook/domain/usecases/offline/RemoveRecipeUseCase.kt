package android.myrecipebook.domain.usecases.offline

import android.myrecipebook.data.offlinedatasource.RecipeRepository
import android.myrecipebook.domain.model.Recipe

class RemoveRecipe(
    private val recipeRepository: RecipeRepository
) {
    suspend operator fun invoke(recipe: Recipe){
        recipeRepository.deleteRecipe(recipe.id)
    }
}