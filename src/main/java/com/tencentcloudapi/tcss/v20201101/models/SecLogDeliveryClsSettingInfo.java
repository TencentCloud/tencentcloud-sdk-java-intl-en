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

public class SecLogDeliveryClsSettingInfo extends AbstractModel {

    /**
    * Log type
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Delivery status. Valid values: `true` (enabled); `false` (disabled).
    */
    @SerializedName("State")
    @Expose
    private Boolean State;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Logset
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * Topic ID
    */
    @SerializedName("TopicID")
    @Expose
    private String TopicID;

    /**
    * logset name
    */
    @SerializedName("LogSetName")
    @Expose
    private String LogSetName;

    /**
    * Topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Log type	
    */
    @SerializedName("SubLogType")
    @Expose
    private String [] SubLogType;

    /**
    * Error message
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get Log type 
     * @return LogType Log type
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Log type
     * @param LogType Log type
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Delivery status. Valid values: `true` (enabled); `false` (disabled). 
     * @return State Delivery status. Valid values: `true` (enabled); `false` (disabled).
     */
    public Boolean getState() {
        return this.State;
    }

    /**
     * Set Delivery status. Valid values: `true` (enabled); `false` (disabled).
     * @param State Delivery status. Valid values: `true` (enabled); `false` (disabled).
     */
    public void setState(Boolean State) {
        this.State = State;
    }

    /**
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Logset 
     * @return LogSet Logset
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set Logset
     * @param LogSet Logset
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get Topic ID 
     * @return TopicID Topic ID
     */
    public String getTopicID() {
        return this.TopicID;
    }

    /**
     * Set Topic ID
     * @param TopicID Topic ID
     */
    public void setTopicID(String TopicID) {
        this.TopicID = TopicID;
    }

    /**
     * Get logset name 
     * @return LogSetName logset name
     */
    public String getLogSetName() {
        return this.LogSetName;
    }

    /**
     * Set logset name
     * @param LogSetName logset name
     */
    public void setLogSetName(String LogSetName) {
        this.LogSetName = LogSetName;
    }

    /**
     * Get Topic name 
     * @return TopicName Topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name
     * @param TopicName Topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Log type	 
     * @return SubLogType Log type	
     */
    public String [] getSubLogType() {
        return this.SubLogType;
    }

    /**
     * Set Log type	
     * @param SubLogType Log type	
     */
    public void setSubLogType(String [] SubLogType) {
        this.SubLogType = SubLogType;
    }

    /**
     * Get Error message 
     * @return ErrMsg Error message
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set Error message
     * @param ErrMsg Error message
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public SecLogDeliveryClsSettingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecLogDeliveryClsSettingInfo(SecLogDeliveryClsSettingInfo source) {
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.State != null) {
            this.State = new Boolean(source.State);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.LogSet != null) {
            this.LogSet = new String(source.LogSet);
        }
        if (source.TopicID != null) {
            this.TopicID = new String(source.TopicID);
        }
        if (source.LogSetName != null) {
            this.LogSetName = new String(source.LogSetName);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.SubLogType != null) {
            this.SubLogType = new String[source.SubLogType.length];
            for (int i = 0; i < source.SubLogType.length; i++) {
                this.SubLogType[i] = new String(source.SubLogType[i]);
            }
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "LogSet", this.LogSet);
        this.setParamSimple(map, prefix + "TopicID", this.TopicID);
        this.setParamSimple(map, prefix + "LogSetName", this.LogSetName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamArraySimple(map, prefix + "SubLogType.", this.SubLogType);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

