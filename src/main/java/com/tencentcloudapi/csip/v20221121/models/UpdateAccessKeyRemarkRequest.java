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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAccessKeyRemarkRequest extends AbstractModel {

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Source IP name.
    */
    @SerializedName("SourceIPList")
    @Expose
    private String [] SourceIPList;

    /**
    * ak name.
    */
    @SerializedName("AccessKeyList")
    @Expose
    private String [] AccessKeyList;

    /**
    * ID of the source IP.
    */
    @SerializedName("SourceIPIDList")
    @Expose
    private Long [] SourceIPIDList;

    /**
    * AK ID.
    */
    @SerializedName("AccessKeyIDList")
    @Expose
    private Long [] AccessKeyIDList;

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Source IP name. 
     * @return SourceIPList Source IP name.
     */
    public String [] getSourceIPList() {
        return this.SourceIPList;
    }

    /**
     * Set Source IP name.
     * @param SourceIPList Source IP name.
     */
    public void setSourceIPList(String [] SourceIPList) {
        this.SourceIPList = SourceIPList;
    }

    /**
     * Get ak name. 
     * @return AccessKeyList ak name.
     */
    public String [] getAccessKeyList() {
        return this.AccessKeyList;
    }

    /**
     * Set ak name.
     * @param AccessKeyList ak name.
     */
    public void setAccessKeyList(String [] AccessKeyList) {
        this.AccessKeyList = AccessKeyList;
    }

    /**
     * Get ID of the source IP. 
     * @return SourceIPIDList ID of the source IP.
     */
    public Long [] getSourceIPIDList() {
        return this.SourceIPIDList;
    }

    /**
     * Set ID of the source IP.
     * @param SourceIPIDList ID of the source IP.
     */
    public void setSourceIPIDList(Long [] SourceIPIDList) {
        this.SourceIPIDList = SourceIPIDList;
    }

    /**
     * Get AK ID. 
     * @return AccessKeyIDList AK ID.
     */
    public Long [] getAccessKeyIDList() {
        return this.AccessKeyIDList;
    }

    /**
     * Set AK ID.
     * @param AccessKeyIDList AK ID.
     */
    public void setAccessKeyIDList(Long [] AccessKeyIDList) {
        this.AccessKeyIDList = AccessKeyIDList;
    }

    public UpdateAccessKeyRemarkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAccessKeyRemarkRequest(UpdateAccessKeyRemarkRequest source) {
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.SourceIPList != null) {
            this.SourceIPList = new String[source.SourceIPList.length];
            for (int i = 0; i < source.SourceIPList.length; i++) {
                this.SourceIPList[i] = new String(source.SourceIPList[i]);
            }
        }
        if (source.AccessKeyList != null) {
            this.AccessKeyList = new String[source.AccessKeyList.length];
            for (int i = 0; i < source.AccessKeyList.length; i++) {
                this.AccessKeyList[i] = new String(source.AccessKeyList[i]);
            }
        }
        if (source.SourceIPIDList != null) {
            this.SourceIPIDList = new Long[source.SourceIPIDList.length];
            for (int i = 0; i < source.SourceIPIDList.length; i++) {
                this.SourceIPIDList[i] = new Long(source.SourceIPIDList[i]);
            }
        }
        if (source.AccessKeyIDList != null) {
            this.AccessKeyIDList = new Long[source.AccessKeyIDList.length];
            for (int i = 0; i < source.AccessKeyIDList.length; i++) {
                this.AccessKeyIDList[i] = new Long(source.AccessKeyIDList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "SourceIPList.", this.SourceIPList);
        this.setParamArraySimple(map, prefix + "AccessKeyList.", this.AccessKeyList);
        this.setParamArraySimple(map, prefix + "SourceIPIDList.", this.SourceIPIDList);
        this.setParamArraySimple(map, prefix + "AccessKeyIDList.", this.AccessKeyIDList);

    }
}

