# Android-Web-VideoPlayer
play video on android using web native library

```
1 - require android:configChanges to prevent screen rotate restarts
2 - require Manifest Internet Permission
3 - require requestWindowFeature(Window.FEATURE_NO_TITLE); getSupportActionBar().hide();
4 - using clapper js
```

## Import Library to Gradle
```
dependencies {
    implementation project(path: ':Web Player')
    ...
    }
```

## Usage

new WebPlayer(activity).play(url_to_play,background_Image);
above code will get a return of webview
###### null background Image will got default Background.

```
setContentView(new WebPlayer(this).play("https://content.jwplatform.com/manifests/yp34SRmf.m3u8","https://cdn57.androidauthority.net/wp-content/uploads/2015/11/00-best-backgrounds-and-wallpaper-apps-for-android.jpg"));
```
