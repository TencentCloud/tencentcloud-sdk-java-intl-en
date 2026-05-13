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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceCertificatesRequest extends AbstractModel {

    /**
    * Tencent Cloud MQTT instance ID can be obtained from the console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Support search parameter
Client id: Client id, obtained based on actual business operations.
CaSn: The SN serial number of the CA certificate belonging to it can be obtained by querying the cluster CA certificate list (https://www.tencentcloud.com/document/api/1778/116206?from_cn_redirect=1) or through business operations.
DeviceCertificateSn: SN serial number of the device certificate. Can be obtained from [Query Device Certificate Detail](https://www.tencentcloud.com/document/api/1778/113748?from_cn_redirect=1).
DeviceCertificateCn: The device certificate CN.
OrganizationalUnit: Cert OU
NotAfterEnd: Certificates with expiration time less than or equal to the specified time
NotAfterStart: Cert with expiration time equal to or greater than the specified time
Status: Device certificate status. ACTIVE (activated); INACTIVE (inactive); REVOKED (revoked); PENDING_ACTIVATION (to be activated).

    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Pagination limit. Default 20. Maximum 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset, default 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting rule
CREATE_TIME_DESC, descending order by creation time
CREATE_TIME_ASC, sort by creation time in ascending order
UPDATE_TIME_DESC, descending order by update time
UPDATE_TIME_ASC, update time in ascending order
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get Tencent Cloud MQTT instance ID can be obtained from the console. 
     * @return InstanceId Tencent Cloud MQTT instance ID can be obtained from the console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Tencent Cloud MQTT instance ID can be obtained from the console.
     * @param InstanceId Tencent Cloud MQTT instance ID can be obtained from the console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Support search parameter
Client id: Client id, obtained based on actual business operations.
CaSn: The SN serial number of the CA certificate belonging to it can be obtained by querying the cluster CA certificate list (https://www.tencentcloud.com/document/api/1778/116206?from_cn_redirect=1) or through business operations.
DeviceCertificateSn: SN serial number of the device certificate. Can be obtained from [Query Device Certificate Detail](https://www.tencentcloud.com/document/api/1778/113748?from_cn_redirect=1).
DeviceCertificateCn: The device certificate CN.
OrganizationalUnit: Cert OU
NotAfterEnd: Certificates with expiration time less than or equal to the specified time
NotAfterStart: Cert with expiration time equal to or greater than the specified time
Status: Device certificate status. ACTIVE (activated); INACTIVE (inactive); REVOKED (revoked); PENDING_ACTIVATION (to be activated).
 
     * @return Filters Support search parameter
Client id: Client id, obtained based on actual business operations.
CaSn: The SN serial number of the CA certificate belonging to it can be obtained by querying the cluster CA certificate list (https://www.tencentcloud.com/document/api/1778/116206?from_cn_redirect=1) or through business operations.
DeviceCertificateSn: SN serial number of the device certificate. Can be obtained from [Query Device Certificate Detail](https://www.tencentcloud.com/document/api/1778/113748?from_cn_redirect=1).
DeviceCertificateCn: The device certificate CN.
OrganizationalUnit: Cert OU
NotAfterEnd: Certificates with expiration time less than or equal to the specified time
NotAfterStart: Cert with expiration time equal to or greater than the specified time
Status: Device certificate status. ACTIVE (activated); INACTIVE (inactive); REVOKED (revoked); PENDING_ACTIVATION (to be activated).

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Support search parameter
Client id: Client id, obtained based on actual business operations.
CaSn: The SN serial number of the CA certificate belonging to it can be obtained by querying the cluster CA certificate list (https://www.tencentcloud.com/document/api/1778/116206?from_cn_redirect=1) or through business operations.
DeviceCertificateSn: SN serial number of the device certificate. Can be obtained from [Query Device Certificate Detail](https://www.tencentcloud.com/document/api/1778/113748?from_cn_redirect=1).
DeviceCertificateCn: The device certificate CN.
OrganizationalUnit: Cert OU
NotAfterEnd: Certificates with expiration time less than or equal to the specified time
NotAfterStart: Cert with expiration time equal to or greater than the specified time
Status: Device certificate status. ACTIVE (activated); INACTIVE (inactive); REVOKED (revoked); PENDING_ACTIVATION (to be activated).

     * @param Filters Support search parameter
Client id: Client id, obtained based on actual business operations.
CaSn: The SN serial number of the CA certificate belonging to it can be obtained by querying the cluster CA certificate list (https://www.tencentcloud.com/document/api/1778/116206?from_cn_redirect=1) or through business operations.
DeviceCertificateSn: SN serial number of the device certificate. Can be obtained from [Query Device Certificate Detail](https://www.tencentcloud.com/document/api/1778/113748?from_cn_redirect=1).
DeviceCertificateCn: The device certificate CN.
OrganizationalUnit: Cert OU
NotAfterEnd: Certificates with expiration time less than or equal to the specified time
NotAfterStart: Cert with expiration time equal to or greater than the specified time
Status: Device certificate status. ACTIVE (activated); INACTIVE (inactive); REVOKED (revoked); PENDING_ACTIVATION (to be activated).

     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Pagination limit. Default 20. Maximum 100. 
     * @return Limit Pagination limit. Default 20. Maximum 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination limit. Default 20. Maximum 100.
     * @param Limit Pagination limit. Default 20. Maximum 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset, default 0 
     * @return Offset Pagination offset, default 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset, default 0
     * @param Offset Pagination offset, default 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting rule
CREATE_TIME_DESC, descending order by creation time
CREATE_TIME_ASC, sort by creation time in ascending order
UPDATE_TIME_DESC, descending order by update time
UPDATE_TIME_ASC, update time in ascending order 
     * @return OrderBy Sorting rule
CREATE_TIME_DESC, descending order by creation time
CREATE_TIME_ASC, sort by creation time in ascending order
UPDATE_TIME_DESC, descending order by update time
UPDATE_TIME_ASC, update time in ascending order
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting rule
CREATE_TIME_DESC, descending order by creation time
CREATE_TIME_ASC, sort by creation time in ascending order
UPDATE_TIME_DESC, descending order by update time
UPDATE_TIME_ASC, update time in ascending order
     * @param OrderBy Sorting rule
CREATE_TIME_DESC, descending order by creation time
CREATE_TIME_ASC, sort by creation time in ascending order
UPDATE_TIME_DESC, descending order by update time
UPDATE_TIME_ASC, update time in ascending order
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    public DescribeDeviceCertificatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceCertificatesRequest(DescribeDeviceCertificatesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

