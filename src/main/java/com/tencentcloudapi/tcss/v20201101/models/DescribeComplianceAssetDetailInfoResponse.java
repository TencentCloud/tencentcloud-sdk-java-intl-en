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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComplianceAssetDetailInfoResponse extends AbstractModel{

    /**
    * Asset details
    */
    @SerializedName("AssetDetailInfo")
    @Expose
    private ComplianceAssetDetailInfo AssetDetailInfo;

    /**
    * This field is returned when the asset is a container.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerDetailInfo")
    @Expose
    private ComplianceContainerDetailInfo ContainerDetailInfo;

    /**
    * This field is returned when the asset is an image.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageDetailInfo")
    @Expose
    private ComplianceImageDetailInfo ImageDetailInfo;

    /**
    * This field is returned when the asset is a server.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostDetailInfo")
    @Expose
    private ComplianceHostDetailInfo HostDetailInfo;

    /**
    * This field is returned when the asset is a K8s asset.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("K8SDetailInfo")
    @Expose
    private ComplianceK8SDetailInfo K8SDetailInfo;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Asset details 
     * @return AssetDetailInfo Asset details
     */
    public ComplianceAssetDetailInfo getAssetDetailInfo() {
        return this.AssetDetailInfo;
    }

    /**
     * Set Asset details
     * @param AssetDetailInfo Asset details
     */
    public void setAssetDetailInfo(ComplianceAssetDetailInfo AssetDetailInfo) {
        this.AssetDetailInfo = AssetDetailInfo;
    }

    /**
     * Get This field is returned when the asset is a container.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerDetailInfo This field is returned when the asset is a container.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ComplianceContainerDetailInfo getContainerDetailInfo() {
        return this.ContainerDetailInfo;
    }

    /**
     * Set This field is returned when the asset is a container.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerDetailInfo This field is returned when the asset is a container.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContainerDetailInfo(ComplianceContainerDetailInfo ContainerDetailInfo) {
        this.ContainerDetailInfo = ContainerDetailInfo;
    }

    /**
     * Get This field is returned when the asset is an image.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageDetailInfo This field is returned when the asset is an image.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ComplianceImageDetailInfo getImageDetailInfo() {
        return this.ImageDetailInfo;
    }

    /**
     * Set This field is returned when the asset is an image.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageDetailInfo This field is returned when the asset is an image.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageDetailInfo(ComplianceImageDetailInfo ImageDetailInfo) {
        this.ImageDetailInfo = ImageDetailInfo;
    }

    /**
     * Get This field is returned when the asset is a server.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostDetailInfo This field is returned when the asset is a server.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ComplianceHostDetailInfo getHostDetailInfo() {
        return this.HostDetailInfo;
    }

    /**
     * Set This field is returned when the asset is a server.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostDetailInfo This field is returned when the asset is a server.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostDetailInfo(ComplianceHostDetailInfo HostDetailInfo) {
        this.HostDetailInfo = HostDetailInfo;
    }

    /**
     * Get This field is returned when the asset is a K8s asset.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return K8SDetailInfo This field is returned when the asset is a K8s asset.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ComplianceK8SDetailInfo getK8SDetailInfo() {
        return this.K8SDetailInfo;
    }

    /**
     * Set This field is returned when the asset is a K8s asset.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param K8SDetailInfo This field is returned when the asset is a K8s asset.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setK8SDetailInfo(ComplianceK8SDetailInfo K8SDetailInfo) {
        this.K8SDetailInfo = K8SDetailInfo;
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

    public DescribeComplianceAssetDetailInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComplianceAssetDetailInfoResponse(DescribeComplianceAssetDetailInfoResponse source) {
        if (source.AssetDetailInfo != null) {
            this.AssetDetailInfo = new ComplianceAssetDetailInfo(source.AssetDetailInfo);
        }
        if (source.ContainerDetailInfo != null) {
            this.ContainerDetailInfo = new ComplianceContainerDetailInfo(source.ContainerDetailInfo);
        }
        if (source.ImageDetailInfo != null) {
            this.ImageDetailInfo = new ComplianceImageDetailInfo(source.ImageDetailInfo);
        }
        if (source.HostDetailInfo != null) {
            this.HostDetailInfo = new ComplianceHostDetailInfo(source.HostDetailInfo);
        }
        if (source.K8SDetailInfo != null) {
            this.K8SDetailInfo = new ComplianceK8SDetailInfo(source.K8SDetailInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AssetDetailInfo.", this.AssetDetailInfo);
        this.setParamObj(map, prefix + "ContainerDetailInfo.", this.ContainerDetailInfo);
        this.setParamObj(map, prefix + "ImageDetailInfo.", this.ImageDetailInfo);
        this.setParamObj(map, prefix + "HostDetailInfo.", this.HostDetailInfo);
        this.setParamObj(map, prefix + "K8SDetailInfo.", this.K8SDetailInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

