
# React Native OneAudience

## Getting started

`$ npm install react-native-one-audience --save`

### Mostly automatic installation

`$ react-native link react-native-one-audience`

### Manual installation


#### iOS [Not available yet]

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-one-audience` and add `RNOneAudience.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNOneAudience.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.fetchsky.RNOneAudiencePackage;` to the imports at the top of the file
  - Add `new RNOneAudiencePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-one-audience'
  	project(':react-native-one-audience').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-one-audience/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-one-audience')
  	```

## Usage
```javascript
import RNOneAudience from 'react-native-one-audience';
...

RNOneAudience.init('your-api-key').then((resp) => {
	console.log('INITIALIZED ONE AUDIENCE', resp);
});

export function setEmailAddress(email) {
	OneAudience.setEmailAddress(email);
}

export function setAge(age) {
	OneAudience.setAge(parseInt(age, 10));
}

export function optOut(email) {
	OneAudience.optOut(email);
}

```
  