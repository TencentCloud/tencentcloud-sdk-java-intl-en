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

public class ModifySnapshotsSharePermissionRequest extends AbstractModel{

    /**
    * List of account IDs with which a snapshot is shared. For the format of array-type parameters, see [API Introduction](https://cloud.tencent.com/document/api/213/568). You can find the account ID in [Account Information](https://console.cloud.tencent.com/developer).
    */
    @SerializedName("AccountIds")
    @Expose
    private String [] AccountIds;

    /**
    * Operations. Valid values: `SHARE`, sharing an image; `CANCEL`, cancelling the sharing of an image.
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
    * The ID of the snapshot. You can obtain this by using [DescribeSnapshots](https://cloud.tencent.com/document/api/362/15647).
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String [] SnapshotIds;

    /**
     * Get List of account IDs with which a snapshot is shared. For the format of array-type parameters, see [API Introduction](https://cloud.tencent.com/document/api/213/568). You can find the account ID in [Account Information](https://console.cloud.tencent.com/developer). 
     * @return AccountIds List of account IDs with which a snapshot is shared. For the format of array-type parameters, see [API Introduction](https://cloud.tencent.com/document/api/213/568). You can find the account ID in [Account Information](https://console.cloud.tencent.com/developer).
     */
    public String [] getAccountIds() {
        return this.AccountIds;
    }

    /**
     * Set List of account IDs with which a snapshot is shared. For the format of array-type parameters, see [API Introduction](https://cloud.tencent.com/document/api/213/568). You can find the account ID in [Account Information](https://console.cloud.tencent.com/developer).
     * @param AccountIds List of account IDs with which a snapshot is shared. For the format of array-type parameters, see [API Introduction](https://cloud.tencent.com/document/api/213/568). You can find the account ID in [Account Information](https://console.cloud.tencent.com/developer).
     */
    public void setAccountIds(String [] AccountIds) {
        this.AccountIds = AccountIds;
    }

    /**
     * Get Operations. Valid values: `SHARE`, sharing an image; `CANCEL`, cancelling the sharing of an image. 
     * @return Permission Operations. Valid values: `SHARE`, sharing an image; `CANCEL`, cancelling the sharing of an image.
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set Operations. Valid values: `SHARE`, sharing an image; `CANCEL`, cancelling the sharing of an image.
     * @param Permission Operations. Valid values: `SHARE`, sharing an image; `CANCEL`, cancelling the sharing of an image.
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    /**
     * Get The ID of the snapshot. You can obtain this by using [DescribeSnapshots](https://cloud.tencent.com/document/api/362/15647). 
     * @return SnapshotIds The ID of the snapshot. You can obtain this by using [DescribeSnapshots](https://cloud.tencent.com/document/api/362/15647).
     */
    public String [] getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * Set The ID of the snapshot. You can obtain this by using [DescribeSnapshots](https://cloud.tencent.com/document/api/362/15647).
     * @param SnapshotIds The ID of the snapshot. You can obtain this by using [DescribeSnapshots](https://cloud.tencent.com/document/api/362/15647).
     */
    public void setSnapshotIds(String [] SnapshotIds) {
        this.SnapshotIds = SnapshotIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AccountIds.", this.AccountIds);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamArraySimple(map, prefix + "SnapshotIds.", this.SnapshotIds);

    }
}

