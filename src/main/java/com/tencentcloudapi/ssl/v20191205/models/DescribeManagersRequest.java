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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeManagersRequest extends AbstractModel {

    /**
    * Company ID, obtain through the API DescribeCompanies
    */
    @SerializedName("CompanyId")
    @Expose
    private Long CompanyId;

    /**
    * Pagination offset. If not provided, default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination quantity per page. If not provided, the default value is 10. Maximum value is 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Manager name (deprecated). Please use SearchKey.
    */
    @SerializedName("ManagerName")
    @Expose
    private String ManagerName;

    /**
    * Fuzzy query manager mailbox (deprecated), please use SearchKey
    */
    @SerializedName("ManagerMail")
    @Expose
    private String ManagerMail;

    /**
    * Filter based on manager status. Valid values:
'none' pending review
'audit', reviewing by AsiaInfo
'CAaudit' CA under review
'ok' reviewed
'review failed' for 'invalid'
expiring soon
expired
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Based on the format: manager surname|manager name|mailbox|department, perform accurate matching
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get Company ID, obtain through the API DescribeCompanies 
     * @return CompanyId Company ID, obtain through the API DescribeCompanies
     */
    public Long getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set Company ID, obtain through the API DescribeCompanies
     * @param CompanyId Company ID, obtain through the API DescribeCompanies
     */
    public void setCompanyId(Long CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get Pagination offset. If not provided, default value is 0. 
     * @return Offset Pagination offset. If not provided, default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. If not provided, default value is 0.
     * @param Offset Pagination offset. If not provided, default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination quantity per page. If not provided, the default value is 10. Maximum value is 1000. 
     * @return Limit Pagination quantity per page. If not provided, the default value is 10. Maximum value is 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination quantity per page. If not provided, the default value is 10. Maximum value is 1000.
     * @param Limit Pagination quantity per page. If not provided, the default value is 10. Maximum value is 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Manager name (deprecated). Please use SearchKey. 
     * @return ManagerName Manager name (deprecated). Please use SearchKey.
     */
    public String getManagerName() {
        return this.ManagerName;
    }

    /**
     * Set Manager name (deprecated). Please use SearchKey.
     * @param ManagerName Manager name (deprecated). Please use SearchKey.
     */
    public void setManagerName(String ManagerName) {
        this.ManagerName = ManagerName;
    }

    /**
     * Get Fuzzy query manager mailbox (deprecated), please use SearchKey 
     * @return ManagerMail Fuzzy query manager mailbox (deprecated), please use SearchKey
     */
    public String getManagerMail() {
        return this.ManagerMail;
    }

    /**
     * Set Fuzzy query manager mailbox (deprecated), please use SearchKey
     * @param ManagerMail Fuzzy query manager mailbox (deprecated), please use SearchKey
     */
    public void setManagerMail(String ManagerMail) {
        this.ManagerMail = ManagerMail;
    }

    /**
     * Get Filter based on manager status. Valid values:
'none' pending review
'audit', reviewing by AsiaInfo
'CAaudit' CA under review
'ok' reviewed
'review failed' for 'invalid'
expiring soon
expired 
     * @return Status Filter based on manager status. Valid values:
'none' pending review
'audit', reviewing by AsiaInfo
'CAaudit' CA under review
'ok' reviewed
'review failed' for 'invalid'
expiring soon
expired
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Filter based on manager status. Valid values:
'none' pending review
'audit', reviewing by AsiaInfo
'CAaudit' CA under review
'ok' reviewed
'review failed' for 'invalid'
expiring soon
expired
     * @param Status Filter based on manager status. Valid values:
'none' pending review
'audit', reviewing by AsiaInfo
'CAaudit' CA under review
'ok' reviewed
'review failed' for 'invalid'
expiring soon
expired
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Based on the format: manager surname|manager name|mailbox|department, perform accurate matching 
     * @return SearchKey Based on the format: manager surname|manager name|mailbox|department, perform accurate matching
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Based on the format: manager surname|manager name|mailbox|department, perform accurate matching
     * @param SearchKey Based on the format: manager surname|manager name|mailbox|department, perform accurate matching
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    public DescribeManagersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeManagersRequest(DescribeManagersRequest source) {
        if (source.CompanyId != null) {
            this.CompanyId = new Long(source.CompanyId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ManagerName != null) {
            this.ManagerName = new String(source.ManagerName);
        }
        if (source.ManagerMail != null) {
            this.ManagerMail = new String(source.ManagerMail);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ManagerName", this.ManagerName);
        this.setParamSimple(map, prefix + "ManagerMail", this.ManagerMail);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);

    }
}

