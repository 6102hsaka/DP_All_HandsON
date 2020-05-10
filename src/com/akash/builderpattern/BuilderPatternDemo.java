package com.akash.builderpattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		// Veg MealBuilder
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());

		// scenario-1
		// Non-Veg MealBuilder
		Meal nonVegMeal1 = mealBuilder.prepareNonVegMeal();
		System.out.println("Non Veg Meal");
		nonVegMeal1.showItems();
		System.out.println("Total Cost: " + nonVegMeal1.getCost());

		// scenario-2
		// Updated Non-Veg MealBuilder
		Meal nonVegMeal2 = mealBuilder.prepareUpdatedNonVegMeal();
		System.out.println("Updated Non Veg Meal");
		nonVegMeal2.showItems();
		System.out.println("Total Cost: " + nonVegMeal2.getCost());
	}

}