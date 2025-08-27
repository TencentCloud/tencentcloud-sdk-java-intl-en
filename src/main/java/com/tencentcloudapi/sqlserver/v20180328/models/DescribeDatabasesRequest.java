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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabasesRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page number in pagination mode. The default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Database name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Collation rule (desc - descending order; asc - ascending order). The default value is desc.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * Whether TDE encryption is enabled. enable - encrypted; disable - unencrypted.
    */
    @SerializedName("Encryption")
    @Expose
    private String Encryption;

    /**
    * Sorting field. (Name - sort by name; CreateTime - sort by creation time). The default value is CreateTime.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get Instance ID 
     * @return InstanceIdSet Instance ID
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set Instance ID
     * @param InstanceIdSet Instance ID
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 20. 
     * @return Limit The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 20.
     * @param Limit The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page number in pagination mode. The default value is 0. 
     * @return Offset Page number in pagination mode. The default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number in pagination mode. The default value is 0.
     * @param Offset Page number in pagination mode. The default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Database name. 
     * @return Name Database name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Database name.
     * @param Name Database name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Collation rule (desc - descending order; asc - ascending order). The default value is desc. 
     * @return OrderByType Collation rule (desc - descending order; asc - ascending order). The default value is desc.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Collation rule (desc - descending order; asc - ascending order). The default value is desc.
     * @param OrderByType Collation rule (desc - descending order; asc - ascending order). The default value is desc.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get Whether TDE encryption is enabled. enable - encrypted; disable - unencrypted. 
     * @return Encryption Whether TDE encryption is enabled. enable - encrypted; disable - unencrypted.
     */
    public String getEncryption() {
        return this.Encryption;
    }

    /**
     * Set Whether TDE encryption is enabled. enable - encrypted; disable - unencrypted.
     * @param Encryption Whether TDE encryption is enabled. enable - encrypted; disable - unencrypted.
     */
    public void setEncryption(String Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get Sorting field. (Name - sort by name; CreateTime - sort by creation time). The default value is CreateTime. 
     * @return OrderBy Sorting field. (Name - sort by name; CreateTime - sort by creation time). The default value is CreateTime.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. (Name - sort by name; CreateTime - sort by creation time). The default value is CreateTime.
     * @param OrderBy Sorting field. (Name - sort by name; CreateTime - sort by creation time). The default value is CreateTime.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    public DescribeDatabasesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabasesRequest(DescribeDatabasesRequest source) {
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.Encryption != null) {
            this.Encryption = new String(source.Encryption);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

