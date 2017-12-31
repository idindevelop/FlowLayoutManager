# FlowLayoutManager
[![](https://jitpack.io/v/simonebortolin/FlowLayoutManager.svg)](https://jitpack.io/#simonebortolin/FlowLayoutManager)

Android 3rd party library to make implementing a FlowLayoutManager

FlowLayoutManager is a layoutManager that works with Android ___RecyclerView___ Widget, to layout views in flow style, with support of ___predictive animations___, item per line limit, auto measurement & alignments (left or right)

## Screenshots
<img src="https://github.com/simonebortolin/FlowLayoutManager/blob/master/image_1.png" alt="" width="200px"></a>

## Installation


Step 1. Add it in your **root** build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        compile 'com.github.simonebortolin:FlowLayoutManager:1.3.0'
	}

Item per line limitation
---
Single item per line
```java
recyclerView.setLayoutManager(new FlowLayoutManager().singleItemPerLine());
```
or x items per line
```java
recyclerView.setLayoutManager(new FlowLayoutManager().maxItemsPerLine(x));
```

to remove Item per line limitation
```java
((FlowLayoutManager)recyclerView.getLayoutManager()).removeItemPerLineLimit();
```

Auto measurement
---
```java
FlowLayoutManager flowLayoutManager = new FlowLayoutManager();
flowLayoutManager.setAutoMeasureEnabled(true);
recyclerView.setLayoutManager(flowLayoutManager);
```

Alignment
---
```java
recyclerView.setLayoutManager(new FlowLayoutManager().setAlignment(Alignment.LEFT));
```
Alignment could be LEFT, CENTER or RIGHT.

## Credits


I thank all the authors of the various commits that I have included in my fork


## License

    Copyright 2016 Xiaofeng Han

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.