## Phase 1: The Field Registry

In Phase 1, I created a species population registry using a HashMap. I added five different species with their population counts and created a feature that allows the user to search for a species by name.

I think a HashMap is better for this project than an array or ArrayList because it stores information using keys and values. Instead of searching through a list to find a species, I can look it up directly using its name.

This makes the program easier to manage as more species are discovered and added to the registry. I also added a message for when a species is not found.

## Phase 2: The Sighting Log

In Phase 2, I updated my program to read animal sightings from a text file instead of entering everything manually.

I used a Scanner to read the file one line at a time. If a species was already in the HashMap, I increased its population count by one. If the species wasn't already registered, I added it with a starting count of one.

The main challenge was understanding how to read the file and update the HashMap correctly. I also learned how to handle a missing file using try and catch.

This phase helped me understand how HashMaps can be used to organize and update information from external files.

## Phase 3: Population Analysis

In Phase 3, I added a feature that finds the species with the highest and lowest population counts in the registry.

I used a loop to go through the HashMap and compare each species' count to the current maximum and minimum values.

Looking up one species by name in a HashMap is usually O(1), meaning it takes about the same amount of time regardless of how many species are stored.

Finding the highest and lowest populations takes O(n) because the program must check every species in the HashMap.

This phase helped me understand the difference between looking up a single value and analyzing an entire collection of data.

## Phase 4: Validation & Reflection

In Phase 4, I tested my Global Biodiversity Initiative program using different sighting files to check for possible errors.

I tested an empty file, a file where each species appeared once, and a file where the same species appeared multiple times. These tests helped me check whether the HashMap updated population counts correctly.

One edge case I looked at was an empty registry. I used isEmpty() to prevent the program from displaying incorrect minimum and maximum values when no species were available.

During the code review, I also noticed that species names are case-sensitive. For example, Deer and deer would be treated as different species. One possible improvement would be to make the search case-insensitive.

Overall, this project helped me understand how HashMaps can store and update data efficiently. I also learned why testing different scenarios is important for making a program more reliable.