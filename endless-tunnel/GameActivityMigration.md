# How To Migrate NativeActivity To GameActivity in Endless-Tunnel


 ## Java Build Script Updates
 [Document](https://developer.android.com/games/agdk/game-activity/migrate-native-activity#gradle-script)

 1. Create a gradle.properties under the Project Folder
 	In my case, the gradle.properties is located in ${PROJECT_NAME}/

 2. Unlike the documenation, GameActivity is running on minsdk 19+. 
 	Update minsdk from the build.gradle(app level) to 19+

 ## Kotlin or Java code Updates
 [Document](https://developer.android.com/games/agdk/game-activity/migrate-native-activity#java-code)

 1. Create an activity by right click **app > new > activity > EmptyActivity**
 	- set as Launcher Activity
 	- Source Langauge as desired
 	- LayoutName : put anything, it's to be deleted

 2. Move to the MainActivity
 	- Delete onCreate() function
 	- Extending GameActivity() instead of AppCompatActivity()

 3. Code block as follows :
 ```
   companion object {
        init {
            System.loadLibrary("game")
        }
    }
 ```

In the endless-tunnel, the c++ file name for the game is libgame.so
This name has to be consistent under
	1. AndroidManifest.xml
	2. MainActivity.kt or MainActivity.java
	3. CMakeList.txt


## C/C++ build script updates
This example follows the "Source Code" way.

It is ok not to remove ${ANDROID_NDK}/sources/android... in the ninja file


## C/C++ Source Code Updates

## Input Event Handling
There was a big changes in the input event handling when migrating from NativeActivity to GameActivity
 


