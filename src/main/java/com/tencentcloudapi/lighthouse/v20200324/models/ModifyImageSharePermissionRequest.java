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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyImageSharePermissionRequest extends AbstractModel {

    /**
    * Image ID, which can be obtained through the ImageId in the returned value of the [DescribeImages](https://www.tencentcloud.com/document/api/213/15715?from_cn_redirect=1) API.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Sharing property, including SHARE and CANCEL. Among them, SHARE indicates sharing, and CANCEL indicates canceling sharing.
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
     * Get Image ID, which can be obtained through the ImageId in the returned value of the [DescribeImages](https://www.tencentcloud.com/document/api/213/15715?from_cn_redirect=1) API. 
     * @return ImageId Image ID, which can be obtained through the ImageId in the returned value of the [DescribeImages](https://www.tencentcloud.com/document/api/213/15715?from_cn_redirect=1) API.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID, which can be obtained through the ImageId in the returned value of the [DescribeImages](https://www.tencentcloud.com/document/api/213/15715?from_cn_redirect=1) API.
     * @param ImageId Image ID, which can be obtained through the ImageId in the returned value of the [DescribeImages](https://www.tencentcloud.com/document/api/213/15715?from_cn_redirect=1) API.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Sharing property, including SHARE and CANCEL. Among them, SHARE indicates sharing, and CANCEL indicates canceling sharing. 
     * @return Permission Sharing property, including SHARE and CANCEL. Among them, SHARE indicates sharing, and CANCEL indicates canceling sharing.
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set Sharing property, including SHARE and CANCEL. Among them, SHARE indicates sharing, and CANCEL indicates canceling sharing.
     * @param Permission Sharing property, including SHARE and CANCEL. Among them, SHARE indicates sharing, and CANCEL indicates canceling sharing.
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    public ModifyImageSharePermissionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyImageSharePermissionRequest(ModifyImageSharePermissionRequest source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "Permission", this.Permission);

    }
}

