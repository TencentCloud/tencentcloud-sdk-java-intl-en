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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogOutputConf extends AbstractModel {

    /**
    * Log consumer type
    */
    @SerializedName("OutputType")
    @Expose
    private String OutputType;

    /**
    * CLS logset
    */
    @SerializedName("ClsLogsetName")
    @Expose
    private String ClsLogsetName;

    /**
    * CLS log topic
    */
    @SerializedName("ClsLogTopicId")
    @Expose
    private String ClsLogTopicId;

    /**
    * CLS logset ID
    */
    @SerializedName("ClsLogsetId")
    @Expose
    private String ClsLogsetId;

    /**
    * CLS log topic name
    */
    @SerializedName("ClsLogTopicName")
    @Expose
    private String ClsLogTopicName;

    /**
     * Get Log consumer type 
     * @return OutputType Log consumer type
     */
    public String getOutputType() {
        return this.OutputType;
    }

    /**
     * Set Log consumer type
     * @param OutputType Log consumer type
     */
    public void setOutputType(String OutputType) {
        this.OutputType = OutputType;
    }

    /**
     * Get CLS logset 
     * @return ClsLogsetName CLS logset
     */
    public String getClsLogsetName() {
        return this.ClsLogsetName;
    }

    /**
     * Set CLS logset
     * @param ClsLogsetName CLS logset
     */
    public void setClsLogsetName(String ClsLogsetName) {
        this.ClsLogsetName = ClsLogsetName;
    }

    /**
     * Get CLS log topic 
     * @return ClsLogTopicId CLS log topic
     */
    public String getClsLogTopicId() {
        return this.ClsLogTopicId;
    }

    /**
     * Set CLS log topic
     * @param ClsLogTopicId CLS log topic
     */
    public void setClsLogTopicId(String ClsLogTopicId) {
        this.ClsLogTopicId = ClsLogTopicId;
    }

    /**
     * Get CLS logset ID 
     * @return ClsLogsetId CLS logset ID
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * Set CLS logset ID
     * @param ClsLogsetId CLS logset ID
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * Get CLS log topic name 
     * @return ClsLogTopicName CLS log topic name
     */
    public String getClsLogTopicName() {
        return this.ClsLogTopicName;
    }

    /**
     * Set CLS log topic name
     * @param ClsLogTopicName CLS log topic name
     */
    public void setClsLogTopicName(String ClsLogTopicName) {
        this.ClsLogTopicName = ClsLogTopicName;
    }

    public LogOutputConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogOutputConf(LogOutputConf source) {
        if (source.OutputType != null) {
            this.OutputType = new String(source.OutputType);
        }
        if (source.ClsLogsetName != null) {
            this.ClsLogsetName = new String(source.ClsLogsetName);
        }
        if (source.ClsLogTopicId != null) {
            this.ClsLogTopicId = new String(source.ClsLogTopicId);
        }
        if (source.ClsLogsetId != null) {
            this.ClsLogsetId = new String(source.ClsLogsetId);
        }
        if (source.ClsLogTopicName != null) {
            this.ClsLogTopicName = new String(source.ClsLogTopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputType", this.OutputType);
        this.setParamSimple(map, prefix + "ClsLogsetName", this.ClsLogsetName);
        this.setParamSimple(map, prefix + "ClsLogTopicId", this.ClsLogTopicId);
        this.setParamSimple(map, prefix + "ClsLogsetId", this.ClsLogsetId);
        this.setParamSimple(map, prefix + "ClsLogTopicName", this.ClsLogTopicName);

    }
}

