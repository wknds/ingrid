# Ingrid

## Project Description

Background: Food waste is a common problem in developed economies. In Switzerland, the average household throws away about 30 percent of still edible food. Creating a food plan and buying only food for what you want to cook may reduce the amount of wasted food drastically.  

The goal of Ingrid is to extract ingredients from recipes into a checklist in order to simplify the process of getting missing ingredients. The ultimate use case would be an integration of Ingrid to local food delivery services.

![alt text](https://github.com/yaw89/ingrid/blob/master/Workflow.png)

## Text Recognition

Use existing libraries (free or under GPL, Apache, etc.) for optical character recognition and image preprocessing (if not done by OCR). See https://en.wikipedia.org/wiki/Comparison_of_optical_character_recognition_software

![alt text](https://github.com/yaw89/ingrid/blob/master/textrecognition_workflow.png)

### Tesseract

Added Tess4J (Java library) to the build path and start doing some text recognition from some pictures taken by my smartphone. Used following configuration: language (eng) 

* Traffic bypass information [[Input picture]](https://github.com/yaw89/ingrid/blob/master/backend/resources/raw_images/ausbau_nordumfahrung_a1.jpg) [[Output text]](https://github.com/yaw89/ingrid/blob/master/backend/resources/output/penne_rezept.txt)
* Recipe for penne [[Input picture]](https://github.com/yaw89/ingrid/blob/master/backend/resources/raw_images/penne_rezept.jpg) [[Output text]](https://github.com/yaw89/ingrid/blob/master/backend/resources/output/penne_rezept.txt)
* USA strategy paper for Near East and South Asia (1983) [[Input picture]](https://github.com/yaw89/ingrid/blob/master/backend/resources/raw_images/usa_strategy_sea_1983.tif) [[Output text]](https://github.com/yaw89/ingrid/blob/master/backend/resources/output/usa_strategy_sea_1983.txt)
