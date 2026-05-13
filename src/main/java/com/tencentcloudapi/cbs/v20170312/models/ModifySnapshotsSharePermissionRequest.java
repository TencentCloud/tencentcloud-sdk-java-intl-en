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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySnapshotsSharePermissionRequest extends AbstractModel {

    /**
    * The ID of the snapshot. You can obtain this by using [DescribeSnapshots](https://intl.cloud.tencent.com/document/api/362/15647?from_cn_redirect=1).
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String [] SnapshotIds;

    /**
    * Account Id list for receiving shared snapshots. the format of array-type parameters can be found in the API overview (https://www.tencentcloud.com/document/API/213/568?from_cn_redirect=1). the account Id is different from a QQ number. to query a user account Id, view the account Id column in the account information (https://console.cloud.tencent.com/developer).
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
     * Get The ID of the snapshot. You can obtain this by using [DescribeSnapshots](https://intl.cloud.tencent.com/document/api/362/15647?from_cn_redirect=1). 
     * @return SnapshotIds The ID of the snapshot. You can obtain this by using [DescribeSnapshots](https://intl.cloud.tencent.com/document/api/362/15647?from_cn_redirect=1).
     */
    public String [] getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * Set The ID of the snapshot. You can obtain this by using [DescribeSnapshots](https://intl.cloud.tencent.com/document/api/362/15647?from_cn_redirect=1).
     * @param SnapshotIds The ID of the snapshot. You can obtain this by using [DescribeSnapshots](https://intl.cloud.tencent.com/document/api/362/15647?from_cn_redirect=1).
     */
    public void setSnapshotIds(String [] SnapshotIds) {
        this.SnapshotIds = SnapshotIds;
    }

    /**
     * Get Account Id list for receiving shared snapshots. the format of array-type parameters can be found in the API overview (https://www.tencentcloud.com/document/API/213/568?from_cn_redirect=1). the account Id is different from a QQ number. to query a user account Id, view the account Id column in the account information (https://console.cloud.tencent.com/developer). 
     * @return AccountIds Account Id list for receiving shared snapshots. the format of array-type parameters can be found in the API overview (https://www.tencentcloud.com/document/API/213/568?from_cn_redirect=1). the account Id is different from a QQ number. to query a user account Id, view the account Id column in the account information (https://console.cloud.tencent.com/developer).
     */
    public String [] getAccountIds() {
        return this.AccountIds;
    }

    /**
     * Set Account Id list for receiving shared snapshots. the format of array-type parameters can be found in the API overview (https://www.tencentcloud.com/document/API/213/568?from_cn_redirect=1). the account Id is different from a QQ number. to query a user account Id, view the account Id column in the account information (https://console.cloud.tencent.com/developer).
     * @param AccountIds Account Id list for receiving shared snapshots. the format of array-type parameters can be found in the API overview (https://www.tencentcloud.com/document/API/213/568?from_cn_redirect=1). the account Id is different from a QQ number. to query a user account Id, view the account Id column in the account information (https://console.cloud.tencent.com/developer).
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

    public ModifySnapshotsSharePermissionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySnapshotsSharePermissionRequest(ModifySnapshotsSharePermissionRequest source) {
        if (source.SnapshotIds != null) {
            this.SnapshotIds = new String[source.SnapshotIds.length];
            for (int i = 0; i < source.SnapshotIds.length; i++) {
                this.SnapshotIds[i] = new String(source.SnapshotIds[i]);
            }
        }
        if (source.AccountIds != null) {
            this.AccountIds = new String[source.AccountIds.length];
            for (int i = 0; i < source.AccountIds.length; i++) {
                this.AccountIds[i] = new String(source.AccountIds[i]);
            }
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SnapshotIds.", this.SnapshotIds);
        this.setParamArraySimple(map, prefix + "AccountIds.", this.AccountIds);
        this.setParamSimple(map, prefix + "Permission", this.Permission);

    }
}

