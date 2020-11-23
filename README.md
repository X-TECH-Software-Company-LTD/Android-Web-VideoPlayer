# Android-Web-VideoPlayer
play video on android using web native library

### optional requirements
```
- Add configChanges property to Activity Manifest to prevent activity restart on Orientation Change
android:configChanges="keyboardHidden|orientation|screenSize"

```

## Import Library to Gradle

1 - Download WebPlayer.arr and place inside "projectName/app/libs" folder .

https://cdn.xtsmm.com/android/libraries/WebPlayer.aar


2 - Update Project gradle
```
flatDir {
  dirs 'libs'
}
```
```
allprojects {
    repositories {
        google()
        jcenter()
        flatDir {
            dirs 'libs'
        }
    }
}
```

3 - Add Depedency at App gradle

```
dependencies {
    implementation(name:'WebPlayer', ext:'aar')
    //other repositories
}
```

## Usage
```
new WebPlayer(activity).play(url_to_play,background_Image);
```
above code will get a return of webview
###### null background Image will got default Background.

```
setContentView(new WebPlayer(this).play("https://content.jwplatform.com/manifests/yp34SRmf.m3u8","https://cdn57.androidauthority.net/wp-content/uploads/2015/11/00-best-backgrounds-and-wallpaper-apps-for-android.jpg"));
```
