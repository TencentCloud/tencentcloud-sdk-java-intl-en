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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRenewInstancesRequest extends AbstractModel {

    /**
    * Maximum number of instances per page. Value range: 1-100.
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * Token for querying the next page of returned results. NextToken is not needed when calling the API for the first time.
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * Get the sorting order of the instance. The enumerated values are as follows:
false = Ascending (default)
true=Descending
    */
    @SerializedName("Reverse")
    @Expose
    private Boolean Reverse;

    /**
    * Renewal flag. Multiple values separated by commas. Enumeration value as follows:
NOTIFY_AND_MANUAL_RENEW: manual renewal.
NOTIFY_AND_AUTO_RENEW: automatic renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: non-renewal upon expiration.
    */
    @SerializedName("RenewFlagList")
    @Expose
    private String [] RenewFlagList;

    /**
    * Instance ID. Multiple IDs separated by commas, with a maximum of 100.
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
    * Expiry time start, format yyyy-MM-dd HH:mm:ss.
    */
    @SerializedName("ExpireTimeStart")
    @Expose
    private String ExpireTimeStart;

    /**
    * Expiry time in the format of yyyy-MM-dd HH:mm:ss.
    */
    @SerializedName("ExpireTimeEnd")
    @Expose
    private String ExpireTimeEnd;

    /**
     * Get Maximum number of instances per page. Value range: 1-100. 
     * @return MaxResults Maximum number of instances per page. Value range: 1-100.
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set Maximum number of instances per page. Value range: 1-100.
     * @param MaxResults Maximum number of instances per page. Value range: 1-100.
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get Token for querying the next page of returned results. NextToken is not needed when calling the API for the first time. 
     * @return NextToken Token for querying the next page of returned results. NextToken is not needed when calling the API for the first time.
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Token for querying the next page of returned results. NextToken is not needed when calling the API for the first time.
     * @param NextToken Token for querying the next page of returned results. NextToken is not needed when calling the API for the first time.
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get Get the sorting order of the instance. The enumerated values are as follows:
false = Ascending (default)
true=Descending 
     * @return Reverse Get the sorting order of the instance. The enumerated values are as follows:
false = Ascending (default)
true=Descending
     */
    public Boolean getReverse() {
        return this.Reverse;
    }

    /**
     * Set Get the sorting order of the instance. The enumerated values are as follows:
false = Ascending (default)
true=Descending
     * @param Reverse Get the sorting order of the instance. The enumerated values are as follows:
false = Ascending (default)
true=Descending
     */
    public void setReverse(Boolean Reverse) {
        this.Reverse = Reverse;
    }

    /**
     * Get Renewal flag. Multiple values separated by commas. Enumeration value as follows:
NOTIFY_AND_MANUAL_RENEW: manual renewal.
NOTIFY_AND_AUTO_RENEW: automatic renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: non-renewal upon expiration. 
     * @return RenewFlagList Renewal flag. Multiple values separated by commas. Enumeration value as follows:
NOTIFY_AND_MANUAL_RENEW: manual renewal.
NOTIFY_AND_AUTO_RENEW: automatic renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: non-renewal upon expiration.
     */
    public String [] getRenewFlagList() {
        return this.RenewFlagList;
    }

    /**
     * Set Renewal flag. Multiple values separated by commas. Enumeration value as follows:
NOTIFY_AND_MANUAL_RENEW: manual renewal.
NOTIFY_AND_AUTO_RENEW: automatic renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: non-renewal upon expiration.
     * @param RenewFlagList Renewal flag. Multiple values separated by commas. Enumeration value as follows:
NOTIFY_AND_MANUAL_RENEW: manual renewal.
NOTIFY_AND_AUTO_RENEW: automatic renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: non-renewal upon expiration.
     */
    public void setRenewFlagList(String [] RenewFlagList) {
        this.RenewFlagList = RenewFlagList;
    }

    /**
     * Get Instance ID. Multiple IDs separated by commas, with a maximum of 100. 
     * @return InstanceIdList Instance ID. Multiple IDs separated by commas, with a maximum of 100.
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set Instance ID. Multiple IDs separated by commas, with a maximum of 100.
     * @param InstanceIdList Instance ID. Multiple IDs separated by commas, with a maximum of 100.
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
    }

    /**
     * Get Expiry time start, format yyyy-MM-dd HH:mm:ss. 
     * @return ExpireTimeStart Expiry time start, format yyyy-MM-dd HH:mm:ss.
     */
    public String getExpireTimeStart() {
        return this.ExpireTimeStart;
    }

    /**
     * Set Expiry time start, format yyyy-MM-dd HH:mm:ss.
     * @param ExpireTimeStart Expiry time start, format yyyy-MM-dd HH:mm:ss.
     */
    public void setExpireTimeStart(String ExpireTimeStart) {
        this.ExpireTimeStart = ExpireTimeStart;
    }

    /**
     * Get Expiry time in the format of yyyy-MM-dd HH:mm:ss. 
     * @return ExpireTimeEnd Expiry time in the format of yyyy-MM-dd HH:mm:ss.
     */
    public String getExpireTimeEnd() {
        return this.ExpireTimeEnd;
    }

    /**
     * Set Expiry time in the format of yyyy-MM-dd HH:mm:ss.
     * @param ExpireTimeEnd Expiry time in the format of yyyy-MM-dd HH:mm:ss.
     */
    public void setExpireTimeEnd(String ExpireTimeEnd) {
        this.ExpireTimeEnd = ExpireTimeEnd;
    }

    public DescribeRenewInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRenewInstancesRequest(DescribeRenewInstancesRequest source) {
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.Reverse != null) {
            this.Reverse = new Boolean(source.Reverse);
        }
        if (source.RenewFlagList != null) {
            this.RenewFlagList = new String[source.RenewFlagList.length];
            for (int i = 0; i < source.RenewFlagList.length; i++) {
                this.RenewFlagList[i] = new String(source.RenewFlagList[i]);
            }
        }
        if (source.InstanceIdList != null) {
            this.InstanceIdList = new String[source.InstanceIdList.length];
            for (int i = 0; i < source.InstanceIdList.length; i++) {
                this.InstanceIdList[i] = new String(source.InstanceIdList[i]);
            }
        }
        if (source.ExpireTimeStart != null) {
            this.ExpireTimeStart = new String(source.ExpireTimeStart);
        }
        if (source.ExpireTimeEnd != null) {
            this.ExpireTimeEnd = new String(source.ExpireTimeEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "Reverse", this.Reverse);
        this.setParamArraySimple(map, prefix + "RenewFlagList.", this.RenewFlagList);
        this.setParamArraySimple(map, prefix + "InstanceIdList.", this.InstanceIdList);
        this.setParamSimple(map, prefix + "ExpireTimeStart", this.ExpireTimeStart);
        this.setParamSimple(map, prefix + "ExpireTimeEnd", this.ExpireTimeEnd);

    }
}

