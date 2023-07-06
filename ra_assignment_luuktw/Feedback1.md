# Comments for assignment 1

- The model is in general good.
- There is an issue with `Course` being _contained_ by `Semester` or `VariantCourse`. With this kind of solution, you are forced to have duplicate information if a course appears in different semester. This is what happens for example with TDT4136 in the example instance `MTDT.xmi`. Having duplicate information is bad because 1) it can cause inconsistencies, and also 2) it means that there is information manually added in the model that can otherwise be generated/derived. 
- The `studyLevel` property of `Course` could (should) also be an 
enumeration (for the same reason as above - avoid duplicating information)
