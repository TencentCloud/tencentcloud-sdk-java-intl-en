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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClsLogsetInfo extends AbstractModel {

    /**
    * Logset ID
    */
    @SerializedName("LogsetID")
    @Expose
    private String LogsetID;

    /**
    * logset name
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * CLS Topic List
    */
    @SerializedName("TopicList")
    @Expose
    private ClsTopicInfo [] TopicList;

    /**
     * Get Logset ID 
     * @return LogsetID Logset ID
     */
    public String getLogsetID() {
        return this.LogsetID;
    }

    /**
     * Set Logset ID
     * @param LogsetID Logset ID
     */
    public void setLogsetID(String LogsetID) {
        this.LogsetID = LogsetID;
    }

    /**
     * Get logset name 
     * @return LogsetName logset name
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set logset name
     * @param LogsetName logset name
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get CLS Topic List 
     * @return TopicList CLS Topic List
     */
    public ClsTopicInfo [] getTopicList() {
        return this.TopicList;
    }

    /**
     * Set CLS Topic List
     * @param TopicList CLS Topic List
     */
    public void setTopicList(ClsTopicInfo [] TopicList) {
        this.TopicList = TopicList;
    }

    public ClsLogsetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClsLogsetInfo(ClsLogsetInfo source) {
        if (source.LogsetID != null) {
            this.LogsetID = new String(source.LogsetID);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.TopicList != null) {
            this.TopicList = new ClsTopicInfo[source.TopicList.length];
            for (int i = 0; i < source.TopicList.length; i++) {
                this.TopicList[i] = new ClsTopicInfo(source.TopicList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetID", this.LogsetID);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamArrayObj(map, prefix + "TopicList.", this.TopicList);

    }
}

