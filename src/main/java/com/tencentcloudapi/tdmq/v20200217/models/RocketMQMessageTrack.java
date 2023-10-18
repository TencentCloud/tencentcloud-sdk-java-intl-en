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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQMessageTrack extends AbstractModel {

    /**
    * Consumer group
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * Consumption status
    */
    @SerializedName("ConsumeStatus")
    @Expose
    private String ConsumeStatus;

    /**
    * Message trace type
    */
    @SerializedName("TrackType")
    @Expose
    private String TrackType;

    /**
    * Exception information
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExceptionDesc")
    @Expose
    private String ExceptionDesc;

    /**
     * Get Consumer group 
     * @return Group Consumer group
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set Consumer group
     * @param Group Consumer group
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get Consumption status 
     * @return ConsumeStatus Consumption status
     */
    public String getConsumeStatus() {
        return this.ConsumeStatus;
    }

    /**
     * Set Consumption status
     * @param ConsumeStatus Consumption status
     */
    public void setConsumeStatus(String ConsumeStatus) {
        this.ConsumeStatus = ConsumeStatus;
    }

    /**
     * Get Message trace type 
     * @return TrackType Message trace type
     */
    public String getTrackType() {
        return this.TrackType;
    }

    /**
     * Set Message trace type
     * @param TrackType Message trace type
     */
    public void setTrackType(String TrackType) {
        this.TrackType = TrackType;
    }

    /**
     * Get Exception information
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return ExceptionDesc Exception information
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getExceptionDesc() {
        return this.ExceptionDesc;
    }

    /**
     * Set Exception information
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param ExceptionDesc Exception information
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setExceptionDesc(String ExceptionDesc) {
        this.ExceptionDesc = ExceptionDesc;
    }

    public RocketMQMessageTrack() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQMessageTrack(RocketMQMessageTrack source) {
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.ConsumeStatus != null) {
            this.ConsumeStatus = new String(source.ConsumeStatus);
        }
        if (source.TrackType != null) {
            this.TrackType = new String(source.TrackType);
        }
        if (source.ExceptionDesc != null) {
            this.ExceptionDesc = new String(source.ExceptionDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "ConsumeStatus", this.ConsumeStatus);
        this.setParamSimple(map, prefix + "TrackType", this.TrackType);
        this.setParamSimple(map, prefix + "ExceptionDesc", this.ExceptionDesc);

    }
}

