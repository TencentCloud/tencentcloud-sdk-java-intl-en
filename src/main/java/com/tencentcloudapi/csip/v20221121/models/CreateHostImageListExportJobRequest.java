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

public class CreateHostImageListExportJobRequest extends AbstractModel {

    /**
    * <p>MD5 of the cluster CA certificate (32-bit hexadecimal, required)</p>
    */
    @SerializedName("ClusterCaMD5")
    @Expose
    private String ClusterCaMD5;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Common ListFilter structure (including Filters array + ListFindOption pagination)<br>Supported filter fields: Host / ImageId / ImageName / HasRunningContainer</p>
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * <p>List of fields to export (all fields are exported if this parameter is not passed)<br>Enumeration values:<br>ImageId: image ID<br>ImageName: image name<br>ImageVersion: mirror version<br>ContainerCount: number of associated containers<br>HostCount: number of associated hosts<br>CreateTime: creation time<br>NickName: account nickname (automatically excluded in single account mode)<br>ScanStatus: scan status<br>LastScanTime: latest scan completion time<br>VulCountCritical: number of critical vulnerabilities<br>VulCountHigh: number of high vulnerabilities<br>VulCountMedium: number of medium vulnerabilities<br>VulCountLow: number of low vulnerabilities<br>VirusCountCritical: number of critical trojans<br>VirusCountHigh: number of high trojans<br>VirusCountMedium: number of medium trojans<br>VirusCountLow: number of low trojans<br>SensitiveCountCritical: number of critical sensitive data items<br>SensitiveCountHigh: number of high sensitive data items<br>SensitiveCountMedium: number of medium sensitive data items<br>SensitiveCountLow: number of low sensitive data items</p>
    */
    @SerializedName("ExportFields")
    @Expose
    private String [] ExportFields;

    /**
     * Get <p>MD5 of the cluster CA certificate (32-bit hexadecimal, required)</p> 
     * @return ClusterCaMD5 <p>MD5 of the cluster CA certificate (32-bit hexadecimal, required)</p>
     */
    public String getClusterCaMD5() {
        return this.ClusterCaMD5;
    }

    /**
     * Set <p>MD5 of the cluster CA certificate (32-bit hexadecimal, required)</p>
     * @param ClusterCaMD5 <p>MD5 of the cluster CA certificate (32-bit hexadecimal, required)</p>
     */
    public void setClusterCaMD5(String ClusterCaMD5) {
        this.ClusterCaMD5 = ClusterCaMD5;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Common ListFilter structure (including Filters array + ListFindOption pagination)<br>Supported filter fields: Host / ImageId / ImageName / HasRunningContainer</p> 
     * @return Filter <p>Common ListFilter structure (including Filters array + ListFindOption pagination)<br>Supported filter fields: Host / ImageId / ImageName / HasRunningContainer</p>
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>Common ListFilter structure (including Filters array + ListFindOption pagination)<br>Supported filter fields: Host / ImageId / ImageName / HasRunningContainer</p>
     * @param Filter <p>Common ListFilter structure (including Filters array + ListFindOption pagination)<br>Supported filter fields: Host / ImageId / ImageName / HasRunningContainer</p>
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>List of fields to export (all fields are exported if this parameter is not passed)<br>Enumeration values:<br>ImageId: image ID<br>ImageName: image name<br>ImageVersion: mirror version<br>ContainerCount: number of associated containers<br>HostCount: number of associated hosts<br>CreateTime: creation time<br>NickName: account nickname (automatically excluded in single account mode)<br>ScanStatus: scan status<br>LastScanTime: latest scan completion time<br>VulCountCritical: number of critical vulnerabilities<br>VulCountHigh: number of high vulnerabilities<br>VulCountMedium: number of medium vulnerabilities<br>VulCountLow: number of low vulnerabilities<br>VirusCountCritical: number of critical trojans<br>VirusCountHigh: number of high trojans<br>VirusCountMedium: number of medium trojans<br>VirusCountLow: number of low trojans<br>SensitiveCountCritical: number of critical sensitive data items<br>SensitiveCountHigh: number of high sensitive data items<br>SensitiveCountMedium: number of medium sensitive data items<br>SensitiveCountLow: number of low sensitive data items</p> 
     * @return ExportFields <p>List of fields to export (all fields are exported if this parameter is not passed)<br>Enumeration values:<br>ImageId: image ID<br>ImageName: image name<br>ImageVersion: mirror version<br>ContainerCount: number of associated containers<br>HostCount: number of associated hosts<br>CreateTime: creation time<br>NickName: account nickname (automatically excluded in single account mode)<br>ScanStatus: scan status<br>LastScanTime: latest scan completion time<br>VulCountCritical: number of critical vulnerabilities<br>VulCountHigh: number of high vulnerabilities<br>VulCountMedium: number of medium vulnerabilities<br>VulCountLow: number of low vulnerabilities<br>VirusCountCritical: number of critical trojans<br>VirusCountHigh: number of high trojans<br>VirusCountMedium: number of medium trojans<br>VirusCountLow: number of low trojans<br>SensitiveCountCritical: number of critical sensitive data items<br>SensitiveCountHigh: number of high sensitive data items<br>SensitiveCountMedium: number of medium sensitive data items<br>SensitiveCountLow: number of low sensitive data items</p>
     */
    public String [] getExportFields() {
        return this.ExportFields;
    }

    /**
     * Set <p>List of fields to export (all fields are exported if this parameter is not passed)<br>Enumeration values:<br>ImageId: image ID<br>ImageName: image name<br>ImageVersion: mirror version<br>ContainerCount: number of associated containers<br>HostCount: number of associated hosts<br>CreateTime: creation time<br>NickName: account nickname (automatically excluded in single account mode)<br>ScanStatus: scan status<br>LastScanTime: latest scan completion time<br>VulCountCritical: number of critical vulnerabilities<br>VulCountHigh: number of high vulnerabilities<br>VulCountMedium: number of medium vulnerabilities<br>VulCountLow: number of low vulnerabilities<br>VirusCountCritical: number of critical trojans<br>VirusCountHigh: number of high trojans<br>VirusCountMedium: number of medium trojans<br>VirusCountLow: number of low trojans<br>SensitiveCountCritical: number of critical sensitive data items<br>SensitiveCountHigh: number of high sensitive data items<br>SensitiveCountMedium: number of medium sensitive data items<br>SensitiveCountLow: number of low sensitive data items</p>
     * @param ExportFields <p>List of fields to export (all fields are exported if this parameter is not passed)<br>Enumeration values:<br>ImageId: image ID<br>ImageName: image name<br>ImageVersion: mirror version<br>ContainerCount: number of associated containers<br>HostCount: number of associated hosts<br>CreateTime: creation time<br>NickName: account nickname (automatically excluded in single account mode)<br>ScanStatus: scan status<br>LastScanTime: latest scan completion time<br>VulCountCritical: number of critical vulnerabilities<br>VulCountHigh: number of high vulnerabilities<br>VulCountMedium: number of medium vulnerabilities<br>VulCountLow: number of low vulnerabilities<br>VirusCountCritical: number of critical trojans<br>VirusCountHigh: number of high trojans<br>VirusCountMedium: number of medium trojans<br>VirusCountLow: number of low trojans<br>SensitiveCountCritical: number of critical sensitive data items<br>SensitiveCountHigh: number of high sensitive data items<br>SensitiveCountMedium: number of medium sensitive data items<br>SensitiveCountLow: number of low sensitive data items</p>
     */
    public void setExportFields(String [] ExportFields) {
        this.ExportFields = ExportFields;
    }

    public CreateHostImageListExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHostImageListExportJobRequest(CreateHostImageListExportJobRequest source) {
        if (source.ClusterCaMD5 != null) {
            this.ClusterCaMD5 = new String(source.ClusterCaMD5);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
        if (source.ExportFields != null) {
            this.ExportFields = new String[source.ExportFields.length];
            for (int i = 0; i < source.ExportFields.length; i++) {
                this.ExportFields[i] = new String(source.ExportFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterCaMD5", this.ClusterCaMD5);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamArraySimple(map, prefix + "ExportFields.", this.ExportFields);

    }
}

