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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMailProfileRequest extends AbstractModel {

    /**
    * Configuration type. Valid values: "dbScan_mail_configuration" (email configuration of database inspection report), "scheduler_mail_configuration" (email configuration of scheduled task report).
    */
    @SerializedName("ProfileType")
    @Expose
    private String ProfileType;

    /**
    * Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Pagination offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of results per page in paginated queries. Maximum value: 50
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Query by the name of email configuration. The name of the regularly sent email configuration should be in the format of "scheduler_"+{instanceId}.
    */
    @SerializedName("ProfileName")
    @Expose
    private String ProfileName;

    /**
     * Get Configuration type. Valid values: "dbScan_mail_configuration" (email configuration of database inspection report), "scheduler_mail_configuration" (email configuration of scheduled task report). 
     * @return ProfileType Configuration type. Valid values: "dbScan_mail_configuration" (email configuration of database inspection report), "scheduler_mail_configuration" (email configuration of scheduled task report).
     */
    public String getProfileType() {
        return this.ProfileType;
    }

    /**
     * Set Configuration type. Valid values: "dbScan_mail_configuration" (email configuration of database inspection report), "scheduler_mail_configuration" (email configuration of scheduled task report).
     * @param ProfileType Configuration type. Valid values: "dbScan_mail_configuration" (email configuration of database inspection report), "scheduler_mail_configuration" (email configuration of scheduled task report).
     */
    public void setProfileType(String ProfileType) {
        this.ProfileType = ProfileType;
    }

    /**
     * Get Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`. 
     * @return Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     * @param Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Pagination offset 
     * @return Offset Pagination offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset
     * @param Offset Pagination offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of results per page in paginated queries. Maximum value: 50 
     * @return Limit The number of results per page in paginated queries. Maximum value: 50
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of results per page in paginated queries. Maximum value: 50
     * @param Limit The number of results per page in paginated queries. Maximum value: 50
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Query by the name of email configuration. The name of the regularly sent email configuration should be in the format of "scheduler_"+{instanceId}. 
     * @return ProfileName Query by the name of email configuration. The name of the regularly sent email configuration should be in the format of "scheduler_"+{instanceId}.
     */
    public String getProfileName() {
        return this.ProfileName;
    }

    /**
     * Set Query by the name of email configuration. The name of the regularly sent email configuration should be in the format of "scheduler_"+{instanceId}.
     * @param ProfileName Query by the name of email configuration. The name of the regularly sent email configuration should be in the format of "scheduler_"+{instanceId}.
     */
    public void setProfileName(String ProfileName) {
        this.ProfileName = ProfileName;
    }

    public DescribeMailProfileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMailProfileRequest(DescribeMailProfileRequest source) {
        if (source.ProfileType != null) {
            this.ProfileType = new String(source.ProfileType);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ProfileName != null) {
            this.ProfileName = new String(source.ProfileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProfileType", this.ProfileType);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ProfileName", this.ProfileName);

    }
}

