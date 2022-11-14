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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEnterpriseSecurityGroupRuleResponse extends AbstractModel{

    /**
    * Page number of the current page displayed for query by page number.
    */
    @SerializedName("PageNo")
    @Expose
    private String PageNo;

    /**
    * Maximum number of entries per page displayed for query by page number.
    */
    @SerializedName("PageSize")
    @Expose
    private String PageSize;

    /**
    * Access control rule list
    */
    @SerializedName("Rules")
    @Expose
    private SecurityGroupRule [] Rules;

    /**
    * Total number of access control rules
    */
    @SerializedName("TotalCount")
    @Expose
    private String TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Page number of the current page displayed for query by page number. 
     * @return PageNo Page number of the current page displayed for query by page number.
     */
    public String getPageNo() {
        return this.PageNo;
    }

    /**
     * Set Page number of the current page displayed for query by page number.
     * @param PageNo Page number of the current page displayed for query by page number.
     */
    public void setPageNo(String PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get Maximum number of entries per page displayed for query by page number. 
     * @return PageSize Maximum number of entries per page displayed for query by page number.
     */
    public String getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Maximum number of entries per page displayed for query by page number.
     * @param PageSize Maximum number of entries per page displayed for query by page number.
     */
    public void setPageSize(String PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Access control rule list 
     * @return Rules Access control rule list
     */
    public SecurityGroupRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set Access control rule list
     * @param Rules Access control rule list
     */
    public void setRules(SecurityGroupRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Total number of access control rules 
     * @return TotalCount Total number of access control rules
     */
    public String getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of access control rules
     * @param TotalCount Total number of access control rules
     */
    public void setTotalCount(String TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeEnterpriseSecurityGroupRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnterpriseSecurityGroupRuleResponse(DescribeEnterpriseSecurityGroupRuleResponse source) {
        if (source.PageNo != null) {
            this.PageNo = new String(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new String(source.PageSize);
        }
        if (source.Rules != null) {
            this.Rules = new SecurityGroupRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new SecurityGroupRule(source.Rules[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new String(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

