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

public class DescribeCallRecordRequest extends AbstractModel {

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Access key ID.
    */
    @SerializedName("AccessKeyID")
    @Expose
    private Long AccessKeyID;

    /**
    * ID of the source IP for the call.
    */
    @SerializedName("SourceIPID")
    @Expose
    private Long SourceIPID;

    /**
    * Access account uin.
    */
    @SerializedName("AccUin")
    @Expose
    private String AccUin;

    /**
    * Filter.
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

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
     * Get Access key ID. 
     * @return AccessKeyID Access key ID.
     */
    public Long getAccessKeyID() {
        return this.AccessKeyID;
    }

    /**
     * Set Access key ID.
     * @param AccessKeyID Access key ID.
     */
    public void setAccessKeyID(Long AccessKeyID) {
        this.AccessKeyID = AccessKeyID;
    }

    /**
     * Get ID of the source IP for the call. 
     * @return SourceIPID ID of the source IP for the call.
     */
    public Long getSourceIPID() {
        return this.SourceIPID;
    }

    /**
     * Set ID of the source IP for the call.
     * @param SourceIPID ID of the source IP for the call.
     */
    public void setSourceIPID(Long SourceIPID) {
        this.SourceIPID = SourceIPID;
    }

    /**
     * Get Access account uin. 
     * @return AccUin Access account uin.
     */
    public String getAccUin() {
        return this.AccUin;
    }

    /**
     * Set Access account uin.
     * @param AccUin Access account uin.
     */
    public void setAccUin(String AccUin) {
        this.AccUin = AccUin;
    }

    /**
     * Get Filter. 
     * @return Filter Filter.
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set Filter.
     * @param Filter Filter.
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    public DescribeCallRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCallRecordRequest(DescribeCallRecordRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.AccessKeyID != null) {
            this.AccessKeyID = new Long(source.AccessKeyID);
        }
        if (source.SourceIPID != null) {
            this.SourceIPID = new Long(source.SourceIPID);
        }
        if (source.AccUin != null) {
            this.AccUin = new String(source.AccUin);
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "AccessKeyID", this.AccessKeyID);
        this.setParamSimple(map, prefix + "SourceIPID", this.SourceIPID);
        this.setParamSimple(map, prefix + "AccUin", this.AccUin);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

