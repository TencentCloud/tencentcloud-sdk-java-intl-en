/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceProfile extends AbstractModel {

    /**
    * <p>Voice name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Voice description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Gender.</p><p>Enumeration values:</p><ul><li>male: male</li><li>female: female</li><li>unknown: unknown</li></ul>
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * <p>Age.</p><p>Enumeration values:</p><ul><li>child: child</li><li>teenager: teenager</li><li>youth: youth</li><li>middle_aged: middle-aged</li><li>senior: senior</li><li>unknown: unknown</li></ul>
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * <p>Language. Supported languages:<br>zh Chinese<br>en English<br>ja Japanese<br>de German<br>fr French<br>ko Korean<br>ru Russian<br>uk Ukrainian<br>pt Portuguese<br>it Italian<br>es Spanish<br>id Indonesian<br>nl Dutch<br>tr Turkish<br>fil Filipino<br>ms Malay<br>el Greek<br>fi Finnish<br>hr Croatian<br>sk Slovak<br>pl Polish<br>sv Swedish<br>hi Hindi<br>bg Bulgarian<br>ro Romanian<br>ar Arabic<br>cs Czech<br>da Danish<br>ta Tamil<br>hun Hungarian<br>vi Vietnamese<br>no Norwegian<br>yue Cantonese<br>th Thai<br>he Hebrew<br>ca Catalan<br>nn Nynorsk<br>af Afrikaans<br>fa Persian<br>sl Slovenian</p>
    */
    @SerializedName("Languages")
    @Expose
    private String [] Languages;

    /**
    * <p>Tag.</p>
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * <p>Scenario.</p>
    */
    @SerializedName("Scenes")
    @Expose
    private String [] Scenes;

    /**
     * Get <p>Voice name.</p> 
     * @return Name <p>Voice name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Voice name.</p>
     * @param Name <p>Voice name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Voice description.</p> 
     * @return Description <p>Voice description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Voice description.</p>
     * @param Description <p>Voice description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Gender.</p><p>Enumeration values:</p><ul><li>male: male</li><li>female: female</li><li>unknown: unknown</li></ul> 
     * @return Gender <p>Gender.</p><p>Enumeration values:</p><ul><li>male: male</li><li>female: female</li><li>unknown: unknown</li></ul>
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set <p>Gender.</p><p>Enumeration values:</p><ul><li>male: male</li><li>female: female</li><li>unknown: unknown</li></ul>
     * @param Gender <p>Gender.</p><p>Enumeration values:</p><ul><li>male: male</li><li>female: female</li><li>unknown: unknown</li></ul>
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get <p>Age.</p><p>Enumeration values:</p><ul><li>child: child</li><li>teenager: teenager</li><li>youth: youth</li><li>middle_aged: middle-aged</li><li>senior: senior</li><li>unknown: unknown</li></ul> 
     * @return Age <p>Age.</p><p>Enumeration values:</p><ul><li>child: child</li><li>teenager: teenager</li><li>youth: youth</li><li>middle_aged: middle-aged</li><li>senior: senior</li><li>unknown: unknown</li></ul>
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set <p>Age.</p><p>Enumeration values:</p><ul><li>child: child</li><li>teenager: teenager</li><li>youth: youth</li><li>middle_aged: middle-aged</li><li>senior: senior</li><li>unknown: unknown</li></ul>
     * @param Age <p>Age.</p><p>Enumeration values:</p><ul><li>child: child</li><li>teenager: teenager</li><li>youth: youth</li><li>middle_aged: middle-aged</li><li>senior: senior</li><li>unknown: unknown</li></ul>
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get <p>Language. Supported languages:<br>zh Chinese<br>en English<br>ja Japanese<br>de German<br>fr French<br>ko Korean<br>ru Russian<br>uk Ukrainian<br>pt Portuguese<br>it Italian<br>es Spanish<br>id Indonesian<br>nl Dutch<br>tr Turkish<br>fil Filipino<br>ms Malay<br>el Greek<br>fi Finnish<br>hr Croatian<br>sk Slovak<br>pl Polish<br>sv Swedish<br>hi Hindi<br>bg Bulgarian<br>ro Romanian<br>ar Arabic<br>cs Czech<br>da Danish<br>ta Tamil<br>hun Hungarian<br>vi Vietnamese<br>no Norwegian<br>yue Cantonese<br>th Thai<br>he Hebrew<br>ca Catalan<br>nn Nynorsk<br>af Afrikaans<br>fa Persian<br>sl Slovenian</p> 
     * @return Languages <p>Language. Supported languages:<br>zh Chinese<br>en English<br>ja Japanese<br>de German<br>fr French<br>ko Korean<br>ru Russian<br>uk Ukrainian<br>pt Portuguese<br>it Italian<br>es Spanish<br>id Indonesian<br>nl Dutch<br>tr Turkish<br>fil Filipino<br>ms Malay<br>el Greek<br>fi Finnish<br>hr Croatian<br>sk Slovak<br>pl Polish<br>sv Swedish<br>hi Hindi<br>bg Bulgarian<br>ro Romanian<br>ar Arabic<br>cs Czech<br>da Danish<br>ta Tamil<br>hun Hungarian<br>vi Vietnamese<br>no Norwegian<br>yue Cantonese<br>th Thai<br>he Hebrew<br>ca Catalan<br>nn Nynorsk<br>af Afrikaans<br>fa Persian<br>sl Slovenian</p>
     */
    public String [] getLanguages() {
        return this.Languages;
    }

    /**
     * Set <p>Language. Supported languages:<br>zh Chinese<br>en English<br>ja Japanese<br>de German<br>fr French<br>ko Korean<br>ru Russian<br>uk Ukrainian<br>pt Portuguese<br>it Italian<br>es Spanish<br>id Indonesian<br>nl Dutch<br>tr Turkish<br>fil Filipino<br>ms Malay<br>el Greek<br>fi Finnish<br>hr Croatian<br>sk Slovak<br>pl Polish<br>sv Swedish<br>hi Hindi<br>bg Bulgarian<br>ro Romanian<br>ar Arabic<br>cs Czech<br>da Danish<br>ta Tamil<br>hun Hungarian<br>vi Vietnamese<br>no Norwegian<br>yue Cantonese<br>th Thai<br>he Hebrew<br>ca Catalan<br>nn Nynorsk<br>af Afrikaans<br>fa Persian<br>sl Slovenian</p>
     * @param Languages <p>Language. Supported languages:<br>zh Chinese<br>en English<br>ja Japanese<br>de German<br>fr French<br>ko Korean<br>ru Russian<br>uk Ukrainian<br>pt Portuguese<br>it Italian<br>es Spanish<br>id Indonesian<br>nl Dutch<br>tr Turkish<br>fil Filipino<br>ms Malay<br>el Greek<br>fi Finnish<br>hr Croatian<br>sk Slovak<br>pl Polish<br>sv Swedish<br>hi Hindi<br>bg Bulgarian<br>ro Romanian<br>ar Arabic<br>cs Czech<br>da Danish<br>ta Tamil<br>hun Hungarian<br>vi Vietnamese<br>no Norwegian<br>yue Cantonese<br>th Thai<br>he Hebrew<br>ca Catalan<br>nn Nynorsk<br>af Afrikaans<br>fa Persian<br>sl Slovenian</p>
     */
    public void setLanguages(String [] Languages) {
        this.Languages = Languages;
    }

    /**
     * Get <p>Tag.</p> 
     * @return Labels <p>Tag.</p>
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>Tag.</p>
     * @param Labels <p>Tag.</p>
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>Scenario.</p> 
     * @return Scenes <p>Scenario.</p>
     */
    public String [] getScenes() {
        return this.Scenes;
    }

    /**
     * Set <p>Scenario.</p>
     * @param Scenes <p>Scenario.</p>
     */
    public void setScenes(String [] Scenes) {
        this.Scenes = Scenes;
    }

    public VoiceProfile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceProfile(VoiceProfile source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.Age != null) {
            this.Age = new String(source.Age);
        }
        if (source.Languages != null) {
            this.Languages = new String[source.Languages.length];
            for (int i = 0; i < source.Languages.length; i++) {
                this.Languages[i] = new String(source.Languages[i]);
            }
        }
        if (source.Labels != null) {
            this.Labels = new String[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new String(source.Labels[i]);
            }
        }
        if (source.Scenes != null) {
            this.Scenes = new String[source.Scenes.length];
            for (int i = 0; i < source.Scenes.length; i++) {
                this.Scenes[i] = new String(source.Scenes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamArraySimple(map, prefix + "Languages.", this.Languages);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamArraySimple(map, prefix + "Scenes.", this.Scenes);

    }
}

