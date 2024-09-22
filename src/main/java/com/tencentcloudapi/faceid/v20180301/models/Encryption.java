/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Encryption extends AbstractModel {

    /**
    * 
    */
    @SerializedName("EncryptList")
    @Expose
    private String [] EncryptList;

    /**
    * 
    */
    @SerializedName("CiphertextBlob")
    @Expose
    private String CiphertextBlob;

    /**
    * 
    */
    @SerializedName("Iv")
    @Expose
    private String Iv;

    /**
    * 
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * 
    */
    @SerializedName("TagList")
    @Expose
    private String [] TagList;

    /**
     * Get  
     * @return EncryptList 
     */
    public String [] getEncryptList() {
        return this.EncryptList;
    }

    /**
     * Set 
     * @param EncryptList 
     */
    public void setEncryptList(String [] EncryptList) {
        this.EncryptList = EncryptList;
    }

    /**
     * Get  
     * @return CiphertextBlob 
     */
    public String getCiphertextBlob() {
        return this.CiphertextBlob;
    }

    /**
     * Set 
     * @param CiphertextBlob 
     */
    public void setCiphertextBlob(String CiphertextBlob) {
        this.CiphertextBlob = CiphertextBlob;
    }

    /**
     * Get  
     * @return Iv 
     */
    public String getIv() {
        return this.Iv;
    }

    /**
     * Set 
     * @param Iv 
     */
    public void setIv(String Iv) {
        this.Iv = Iv;
    }

    /**
     * Get  
     * @return Algorithm 
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set 
     * @param Algorithm 
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get  
     * @return TagList 
     */
    public String [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 
     * @param TagList 
     */
    public void setTagList(String [] TagList) {
        this.TagList = TagList;
    }

    public Encryption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Encryption(Encryption source) {
        if (source.EncryptList != null) {
            this.EncryptList = new String[source.EncryptList.length];
            for (int i = 0; i < source.EncryptList.length; i++) {
                this.EncryptList[i] = new String(source.EncryptList[i]);
            }
        }
        if (source.CiphertextBlob != null) {
            this.CiphertextBlob = new String(source.CiphertextBlob);
        }
        if (source.Iv != null) {
            this.Iv = new String(source.Iv);
        }
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
        if (source.TagList != null) {
            this.TagList = new String[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new String(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EncryptList.", this.EncryptList);
        this.setParamSimple(map, prefix + "CiphertextBlob", this.CiphertextBlob);
        this.setParamSimple(map, prefix + "Iv", this.Iv);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamArraySimple(map, prefix + "TagList.", this.TagList);

    }
}

