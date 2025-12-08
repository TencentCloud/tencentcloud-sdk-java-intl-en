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
package com.tencentcloudapi.controlcenter.v20230110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountFactoryItem extends AbstractModel {

    /**
    * Specifies the unique identifier for account factory baseline item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters.
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * Baseline item name. specifies a unique name for the feature item. supports a combination of english letters, numbers, chinese characters, and symbols @, &, _, [, ], -. valid values: 1-25 chinese or english characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Baseline item english name. specifies a unique name for the baseline item. supports a combination of english letters, digits, spaces, and symbols @, &, _, [], -. valid values: 1-64 english characters.
    */
    @SerializedName("NameEn")
    @Expose
    private String NameEn;

    /**
    * Baseline item weight. the smaller the value, the higher the weight. value range equal to or greater than 0.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Specifies whether the baseline item is required (1: required; 0: optional).
    */
    @SerializedName("Required")
    @Expose
    private Long Required;

    /**
    * Baseline item dependency. value range of N depends on the count of other baseline items it relies on.
    */
    @SerializedName("DependsOn")
    @Expose
    private DependsOnItem [] DependsOn;

    /**
    * Baseline description, with a length of 2 to 256 english or chinese characters. it is empty by default.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Baseline item english description, with a length of 2 to 1024 english characters. it is empty by default.
    */
    @SerializedName("DescriptionEn")
    @Expose
    private String DescriptionEn;

    /**
    * Baseline classification. length: 2-32 english or chinese characters. values cannot be empty.
    */
    @SerializedName("Classify")
    @Expose
    private String Classify;

    /**
    * Baseline english classification, with a length of 2-64 english characters. cannot be empty.
    */
    @SerializedName("ClassifyEn")
    @Expose
    private String ClassifyEn;

    /**
     * Get Specifies the unique identifier for account factory baseline item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters. 
     * @return Identifier Specifies the unique identifier for account factory baseline item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters.
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set Specifies the unique identifier for account factory baseline item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters.
     * @param Identifier Specifies the unique identifier for account factory baseline item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters.
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get Baseline item name. specifies a unique name for the feature item. supports a combination of english letters, numbers, chinese characters, and symbols @, &, _, [, ], -. valid values: 1-25 chinese or english characters. 
     * @return Name Baseline item name. specifies a unique name for the feature item. supports a combination of english letters, numbers, chinese characters, and symbols @, &, _, [, ], -. valid values: 1-25 chinese or english characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Baseline item name. specifies a unique name for the feature item. supports a combination of english letters, numbers, chinese characters, and symbols @, &, _, [, ], -. valid values: 1-25 chinese or english characters.
     * @param Name Baseline item name. specifies a unique name for the feature item. supports a combination of english letters, numbers, chinese characters, and symbols @, &, _, [, ], -. valid values: 1-25 chinese or english characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Baseline item english name. specifies a unique name for the baseline item. supports a combination of english letters, digits, spaces, and symbols @, &, _, [], -. valid values: 1-64 english characters. 
     * @return NameEn Baseline item english name. specifies a unique name for the baseline item. supports a combination of english letters, digits, spaces, and symbols @, &, _, [], -. valid values: 1-64 english characters.
     */
    public String getNameEn() {
        return this.NameEn;
    }

    /**
     * Set Baseline item english name. specifies a unique name for the baseline item. supports a combination of english letters, digits, spaces, and symbols @, &, _, [], -. valid values: 1-64 english characters.
     * @param NameEn Baseline item english name. specifies a unique name for the baseline item. supports a combination of english letters, digits, spaces, and symbols @, &, _, [], -. valid values: 1-64 english characters.
     */
    public void setNameEn(String NameEn) {
        this.NameEn = NameEn;
    }

    /**
     * Get Baseline item weight. the smaller the value, the higher the weight. value range equal to or greater than 0. 
     * @return Weight Baseline item weight. the smaller the value, the higher the weight. value range equal to or greater than 0.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Baseline item weight. the smaller the value, the higher the weight. value range equal to or greater than 0.
     * @param Weight Baseline item weight. the smaller the value, the higher the weight. value range equal to or greater than 0.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Specifies whether the baseline item is required (1: required; 0: optional). 
     * @return Required Specifies whether the baseline item is required (1: required; 0: optional).
     */
    public Long getRequired() {
        return this.Required;
    }

    /**
     * Set Specifies whether the baseline item is required (1: required; 0: optional).
     * @param Required Specifies whether the baseline item is required (1: required; 0: optional).
     */
    public void setRequired(Long Required) {
        this.Required = Required;
    }

    /**
     * Get Baseline item dependency. value range of N depends on the count of other baseline items it relies on. 
     * @return DependsOn Baseline item dependency. value range of N depends on the count of other baseline items it relies on.
     */
    public DependsOnItem [] getDependsOn() {
        return this.DependsOn;
    }

    /**
     * Set Baseline item dependency. value range of N depends on the count of other baseline items it relies on.
     * @param DependsOn Baseline item dependency. value range of N depends on the count of other baseline items it relies on.
     */
    public void setDependsOn(DependsOnItem [] DependsOn) {
        this.DependsOn = DependsOn;
    }

    /**
     * Get Baseline description, with a length of 2 to 256 english or chinese characters. it is empty by default. 
     * @return Description Baseline description, with a length of 2 to 256 english or chinese characters. it is empty by default.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Baseline description, with a length of 2 to 256 english or chinese characters. it is empty by default.
     * @param Description Baseline description, with a length of 2 to 256 english or chinese characters. it is empty by default.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Baseline item english description, with a length of 2 to 1024 english characters. it is empty by default. 
     * @return DescriptionEn Baseline item english description, with a length of 2 to 1024 english characters. it is empty by default.
     */
    public String getDescriptionEn() {
        return this.DescriptionEn;
    }

    /**
     * Set Baseline item english description, with a length of 2 to 1024 english characters. it is empty by default.
     * @param DescriptionEn Baseline item english description, with a length of 2 to 1024 english characters. it is empty by default.
     */
    public void setDescriptionEn(String DescriptionEn) {
        this.DescriptionEn = DescriptionEn;
    }

    /**
     * Get Baseline classification. length: 2-32 english or chinese characters. values cannot be empty. 
     * @return Classify Baseline classification. length: 2-32 english or chinese characters. values cannot be empty.
     */
    public String getClassify() {
        return this.Classify;
    }

    /**
     * Set Baseline classification. length: 2-32 english or chinese characters. values cannot be empty.
     * @param Classify Baseline classification. length: 2-32 english or chinese characters. values cannot be empty.
     */
    public void setClassify(String Classify) {
        this.Classify = Classify;
    }

    /**
     * Get Baseline english classification, with a length of 2-64 english characters. cannot be empty. 
     * @return ClassifyEn Baseline english classification, with a length of 2-64 english characters. cannot be empty.
     */
    public String getClassifyEn() {
        return this.ClassifyEn;
    }

    /**
     * Set Baseline english classification, with a length of 2-64 english characters. cannot be empty.
     * @param ClassifyEn Baseline english classification, with a length of 2-64 english characters. cannot be empty.
     */
    public void setClassifyEn(String ClassifyEn) {
        this.ClassifyEn = ClassifyEn;
    }

    public AccountFactoryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountFactoryItem(AccountFactoryItem source) {
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NameEn != null) {
            this.NameEn = new String(source.NameEn);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Required != null) {
            this.Required = new Long(source.Required);
        }
        if (source.DependsOn != null) {
            this.DependsOn = new DependsOnItem[source.DependsOn.length];
            for (int i = 0; i < source.DependsOn.length; i++) {
                this.DependsOn[i] = new DependsOnItem(source.DependsOn[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DescriptionEn != null) {
            this.DescriptionEn = new String(source.DescriptionEn);
        }
        if (source.Classify != null) {
            this.Classify = new String(source.Classify);
        }
        if (source.ClassifyEn != null) {
            this.ClassifyEn = new String(source.ClassifyEn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NameEn", this.NameEn);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Required", this.Required);
        this.setParamArrayObj(map, prefix + "DependsOn.", this.DependsOn);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DescriptionEn", this.DescriptionEn);
        this.setParamSimple(map, prefix + "Classify", this.Classify);
        this.setParamSimple(map, prefix + "ClassifyEn", this.ClassifyEn);

    }
}

