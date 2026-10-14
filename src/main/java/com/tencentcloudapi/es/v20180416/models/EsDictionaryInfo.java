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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EsDictionaryInfo extends AbstractModel {

    /**
    * List of enabled word dictionaries
    */
    @SerializedName("MainDict")
    @Expose
    private DictInfo [] MainDict;

    /**
    * List of stopword dictionaries
    */
    @SerializedName("Stopwords")
    @Expose
    private DictInfo [] Stopwords;

    /**
    * List of QQ word segmentation dictionaries
    */
    @SerializedName("QQDict")
    @Expose
    private DictInfo [] QQDict;

    /**
    * List of synonym dictionaries
    */
    @SerializedName("Synonym")
    @Expose
    private DictInfo [] Synonym;

    /**
    * Update the dictionary type
    */
    @SerializedName("UpdateType")
    @Expose
    private String UpdateType;

    /**
    * List of ansj enabled word dictionaries
    */
    @SerializedName("AnsjMain")
    @Expose
    private DictInfo [] AnsjMain;

    /**
    * List of ansj stopword dictionaries
    */
    @SerializedName("AnsjStop")
    @Expose
    private DictInfo [] AnsjStop;

    /**
    * List of ansj ambiguity lexicons
    */
    @SerializedName("AnsjAmbiguity")
    @Expose
    private DictInfo [] AnsjAmbiguity;

    /**
    * List of ansj synonym dictionaries
    */
    @SerializedName("AnsjSynonyms")
    @Expose
    private DictInfo [] AnsjSynonyms;

    /**
     * Get List of enabled word dictionaries 
     * @return MainDict List of enabled word dictionaries
     */
    public DictInfo [] getMainDict() {
        return this.MainDict;
    }

    /**
     * Set List of enabled word dictionaries
     * @param MainDict List of enabled word dictionaries
     */
    public void setMainDict(DictInfo [] MainDict) {
        this.MainDict = MainDict;
    }

    /**
     * Get List of stopword dictionaries 
     * @return Stopwords List of stopword dictionaries
     */
    public DictInfo [] getStopwords() {
        return this.Stopwords;
    }

    /**
     * Set List of stopword dictionaries
     * @param Stopwords List of stopword dictionaries
     */
    public void setStopwords(DictInfo [] Stopwords) {
        this.Stopwords = Stopwords;
    }

    /**
     * Get List of QQ word segmentation dictionaries 
     * @return QQDict List of QQ word segmentation dictionaries
     */
    public DictInfo [] getQQDict() {
        return this.QQDict;
    }

    /**
     * Set List of QQ word segmentation dictionaries
     * @param QQDict List of QQ word segmentation dictionaries
     */
    public void setQQDict(DictInfo [] QQDict) {
        this.QQDict = QQDict;
    }

    /**
     * Get List of synonym dictionaries 
     * @return Synonym List of synonym dictionaries
     */
    public DictInfo [] getSynonym() {
        return this.Synonym;
    }

    /**
     * Set List of synonym dictionaries
     * @param Synonym List of synonym dictionaries
     */
    public void setSynonym(DictInfo [] Synonym) {
        this.Synonym = Synonym;
    }

    /**
     * Get Update the dictionary type 
     * @return UpdateType Update the dictionary type
     */
    public String getUpdateType() {
        return this.UpdateType;
    }

    /**
     * Set Update the dictionary type
     * @param UpdateType Update the dictionary type
     */
    public void setUpdateType(String UpdateType) {
        this.UpdateType = UpdateType;
    }

    /**
     * Get List of ansj enabled word dictionaries 
     * @return AnsjMain List of ansj enabled word dictionaries
     */
    public DictInfo [] getAnsjMain() {
        return this.AnsjMain;
    }

    /**
     * Set List of ansj enabled word dictionaries
     * @param AnsjMain List of ansj enabled word dictionaries
     */
    public void setAnsjMain(DictInfo [] AnsjMain) {
        this.AnsjMain = AnsjMain;
    }

    /**
     * Get List of ansj stopword dictionaries 
     * @return AnsjStop List of ansj stopword dictionaries
     */
    public DictInfo [] getAnsjStop() {
        return this.AnsjStop;
    }

    /**
     * Set List of ansj stopword dictionaries
     * @param AnsjStop List of ansj stopword dictionaries
     */
    public void setAnsjStop(DictInfo [] AnsjStop) {
        this.AnsjStop = AnsjStop;
    }

    /**
     * Get List of ansj ambiguity lexicons 
     * @return AnsjAmbiguity List of ansj ambiguity lexicons
     */
    public DictInfo [] getAnsjAmbiguity() {
        return this.AnsjAmbiguity;
    }

    /**
     * Set List of ansj ambiguity lexicons
     * @param AnsjAmbiguity List of ansj ambiguity lexicons
     */
    public void setAnsjAmbiguity(DictInfo [] AnsjAmbiguity) {
        this.AnsjAmbiguity = AnsjAmbiguity;
    }

    /**
     * Get List of ansj synonym dictionaries 
     * @return AnsjSynonyms List of ansj synonym dictionaries
     */
    public DictInfo [] getAnsjSynonyms() {
        return this.AnsjSynonyms;
    }

    /**
     * Set List of ansj synonym dictionaries
     * @param AnsjSynonyms List of ansj synonym dictionaries
     */
    public void setAnsjSynonyms(DictInfo [] AnsjSynonyms) {
        this.AnsjSynonyms = AnsjSynonyms;
    }

    public EsDictionaryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EsDictionaryInfo(EsDictionaryInfo source) {
        if (source.MainDict != null) {
            this.MainDict = new DictInfo[source.MainDict.length];
            for (int i = 0; i < source.MainDict.length; i++) {
                this.MainDict[i] = new DictInfo(source.MainDict[i]);
            }
        }
        if (source.Stopwords != null) {
            this.Stopwords = new DictInfo[source.Stopwords.length];
            for (int i = 0; i < source.Stopwords.length; i++) {
                this.Stopwords[i] = new DictInfo(source.Stopwords[i]);
            }
        }
        if (source.QQDict != null) {
            this.QQDict = new DictInfo[source.QQDict.length];
            for (int i = 0; i < source.QQDict.length; i++) {
                this.QQDict[i] = new DictInfo(source.QQDict[i]);
            }
        }
        if (source.Synonym != null) {
            this.Synonym = new DictInfo[source.Synonym.length];
            for (int i = 0; i < source.Synonym.length; i++) {
                this.Synonym[i] = new DictInfo(source.Synonym[i]);
            }
        }
        if (source.UpdateType != null) {
            this.UpdateType = new String(source.UpdateType);
        }
        if (source.AnsjMain != null) {
            this.AnsjMain = new DictInfo[source.AnsjMain.length];
            for (int i = 0; i < source.AnsjMain.length; i++) {
                this.AnsjMain[i] = new DictInfo(source.AnsjMain[i]);
            }
        }
        if (source.AnsjStop != null) {
            this.AnsjStop = new DictInfo[source.AnsjStop.length];
            for (int i = 0; i < source.AnsjStop.length; i++) {
                this.AnsjStop[i] = new DictInfo(source.AnsjStop[i]);
            }
        }
        if (source.AnsjAmbiguity != null) {
            this.AnsjAmbiguity = new DictInfo[source.AnsjAmbiguity.length];
            for (int i = 0; i < source.AnsjAmbiguity.length; i++) {
                this.AnsjAmbiguity[i] = new DictInfo(source.AnsjAmbiguity[i]);
            }
        }
        if (source.AnsjSynonyms != null) {
            this.AnsjSynonyms = new DictInfo[source.AnsjSynonyms.length];
            for (int i = 0; i < source.AnsjSynonyms.length; i++) {
                this.AnsjSynonyms[i] = new DictInfo(source.AnsjSynonyms[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MainDict.", this.MainDict);
        this.setParamArrayObj(map, prefix + "Stopwords.", this.Stopwords);
        this.setParamArrayObj(map, prefix + "QQDict.", this.QQDict);
        this.setParamArrayObj(map, prefix + "Synonym.", this.Synonym);
        this.setParamSimple(map, prefix + "UpdateType", this.UpdateType);
        this.setParamArrayObj(map, prefix + "AnsjMain.", this.AnsjMain);
        this.setParamArrayObj(map, prefix + "AnsjStop.", this.AnsjStop);
        this.setParamArrayObj(map, prefix + "AnsjAmbiguity.", this.AnsjAmbiguity);
        this.setParamArrayObj(map, prefix + "AnsjSynonyms.", this.AnsjSynonyms);

    }
}

