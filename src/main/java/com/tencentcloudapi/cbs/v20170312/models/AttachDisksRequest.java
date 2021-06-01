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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachDisksRequest extends AbstractModel{

    /**
    * ID of the CVM instance on which the cloud disk will be mounted. It can be queried via the API [DescribeInstances](https://intl.cloud.tencent.com/document/product/213/15728?from_cn_redirect=1).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ID of the elastic cloud disk to be mounted, which can be queried through the API [DescribeDisks](https://intl.cloud.tencent.com/document/product/362/16315?from_cn_redirect=1). A maximum of 10 elastic cloud disks can be mounted in a single request.
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * Optional parameter. If this is not passed only the mount operation is executed. If `True` is passed, the cloud disk will be configured to be terminated when the server it is mounted to is terminated. This is only valid for pay-as-you-go cloud disks.
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
    * (Optional) Specifies the cloud disk mounting method. It’s only valid for BM models. Valid values: <br><li>PF<br><li>VF
    */
    @SerializedName("AttachMode")
    @Expose
    private String AttachMode;

    /**
     * Get ID of the CVM instance on which the cloud disk will be mounted. It can be queried via the API [DescribeInstances](https://intl.cloud.tencent.com/document/product/213/15728?from_cn_redirect=1). 
     * @return InstanceId ID of the CVM instance on which the cloud disk will be mounted. It can be queried via the API [DescribeInstances](https://intl.cloud.tencent.com/document/product/213/15728?from_cn_redirect=1).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the CVM instance on which the cloud disk will be mounted. It can be queried via the API [DescribeInstances](https://intl.cloud.tencent.com/document/product/213/15728?from_cn_redirect=1).
     * @param InstanceId ID of the CVM instance on which the cloud disk will be mounted. It can be queried via the API [DescribeInstances](https://intl.cloud.tencent.com/document/product/213/15728?from_cn_redirect=1).
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ID of the elastic cloud disk to be mounted, which can be queried through the API [DescribeDisks](https://intl.cloud.tencent.com/document/product/362/16315?from_cn_redirect=1). A maximum of 10 elastic cloud disks can be mounted in a single request. 
     * @return DiskIds ID of the elastic cloud disk to be mounted, which can be queried through the API [DescribeDisks](https://intl.cloud.tencent.com/document/product/362/16315?from_cn_redirect=1). A maximum of 10 elastic cloud disks can be mounted in a single request.
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set ID of the elastic cloud disk to be mounted, which can be queried through the API [DescribeDisks](https://intl.cloud.tencent.com/document/product/362/16315?from_cn_redirect=1). A maximum of 10 elastic cloud disks can be mounted in a single request.
     * @param DiskIds ID of the elastic cloud disk to be mounted, which can be queried through the API [DescribeDisks](https://intl.cloud.tencent.com/document/product/362/16315?from_cn_redirect=1). A maximum of 10 elastic cloud disks can be mounted in a single request.
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get Optional parameter. If this is not passed only the mount operation is executed. If `True` is passed, the cloud disk will be configured to be terminated when the server it is mounted to is terminated. This is only valid for pay-as-you-go cloud disks. 
     * @return DeleteWithInstance Optional parameter. If this is not passed only the mount operation is executed. If `True` is passed, the cloud disk will be configured to be terminated when the server it is mounted to is terminated. This is only valid for pay-as-you-go cloud disks.
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set Optional parameter. If this is not passed only the mount operation is executed. If `True` is passed, the cloud disk will be configured to be terminated when the server it is mounted to is terminated. This is only valid for pay-as-you-go cloud disks.
     * @param DeleteWithInstance Optional parameter. If this is not passed only the mount operation is executed. If `True` is passed, the cloud disk will be configured to be terminated when the server it is mounted to is terminated. This is only valid for pay-as-you-go cloud disks.
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    /**
     * Get (Optional) Specifies the cloud disk mounting method. It’s only valid for BM models. Valid values: <br><li>PF<br><li>VF 
     * @return AttachMode (Optional) Specifies the cloud disk mounting method. It’s only valid for BM models. Valid values: <br><li>PF<br><li>VF
     */
    public String getAttachMode() {
        return this.AttachMode;
    }

    /**
     * Set (Optional) Specifies the cloud disk mounting method. It’s only valid for BM models. Valid values: <br><li>PF<br><li>VF
     * @param AttachMode (Optional) Specifies the cloud disk mounting method. It’s only valid for BM models. Valid values: <br><li>PF<br><li>VF
     */
    public void setAttachMode(String AttachMode) {
        this.AttachMode = AttachMode;
    }

    public AttachDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachDisksRequest(AttachDisksRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.DeleteWithInstance != null) {
            this.DeleteWithInstance = new Boolean(source.DeleteWithInstance);
        }
        if (source.AttachMode != null) {
            this.AttachMode = new String(source.AttachMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);
        this.setParamSimple(map, prefix + "AttachMode", this.AttachMode);

    }
}

