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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkipCondition extends AbstractModel{

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("Selector")
    @Expose
    private String Selector;

    /**
    * 
    */
    @SerializedName("MatchFromType")
    @Expose
    private String MatchFromType;

    /**
    * 
    */
    @SerializedName("MatchFrom")
    @Expose
    private String [] MatchFrom;

    /**
    * 
    */
    @SerializedName("MatchContentType")
    @Expose
    private String MatchContentType;

    /**
    * 
    */
    @SerializedName("MatchContent")
    @Expose
    private String [] MatchContent;

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return Selector 
     */
    public String getSelector() {
        return this.Selector;
    }

    /**
     * Set 
     * @param Selector 
     */
    public void setSelector(String Selector) {
        this.Selector = Selector;
    }

    /**
     * Get  
     * @return MatchFromType 
     */
    public String getMatchFromType() {
        return this.MatchFromType;
    }

    /**
     * Set 
     * @param MatchFromType 
     */
    public void setMatchFromType(String MatchFromType) {
        this.MatchFromType = MatchFromType;
    }

    /**
     * Get  
     * @return MatchFrom 
     */
    public String [] getMatchFrom() {
        return this.MatchFrom;
    }

    /**
     * Set 
     * @param MatchFrom 
     */
    public void setMatchFrom(String [] MatchFrom) {
        this.MatchFrom = MatchFrom;
    }

    /**
     * Get  
     * @return MatchContentType 
     */
    public String getMatchContentType() {
        return this.MatchContentType;
    }

    /**
     * Set 
     * @param MatchContentType 
     */
    public void setMatchContentType(String MatchContentType) {
        this.MatchContentType = MatchContentType;
    }

    /**
     * Get  
     * @return MatchContent 
     */
    public String [] getMatchContent() {
        return this.MatchContent;
    }

    /**
     * Set 
     * @param MatchContent 
     */
    public void setMatchContent(String [] MatchContent) {
        this.MatchContent = MatchContent;
    }

    public SkipCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkipCondition(SkipCondition source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Selector != null) {
            this.Selector = new String(source.Selector);
        }
        if (source.MatchFromType != null) {
            this.MatchFromType = new String(source.MatchFromType);
        }
        if (source.MatchFrom != null) {
            this.MatchFrom = new String[source.MatchFrom.length];
            for (int i = 0; i < source.MatchFrom.length; i++) {
                this.MatchFrom[i] = new String(source.MatchFrom[i]);
            }
        }
        if (source.MatchContentType != null) {
            this.MatchContentType = new String(source.MatchContentType);
        }
        if (source.MatchContent != null) {
            this.MatchContent = new String[source.MatchContent.length];
            for (int i = 0; i < source.MatchContent.length; i++) {
                this.MatchContent[i] = new String(source.MatchContent[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Selector", this.Selector);
        this.setParamSimple(map, prefix + "MatchFromType", this.MatchFromType);
        this.setParamArraySimple(map, prefix + "MatchFrom.", this.MatchFrom);
        this.setParamSimple(map, prefix + "MatchContentType", this.MatchContentType);
        this.setParamArraySimple(map, prefix + "MatchContent.", this.MatchContent);

    }
}

