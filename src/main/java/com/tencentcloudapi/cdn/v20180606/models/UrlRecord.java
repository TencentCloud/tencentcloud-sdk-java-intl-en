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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UrlRecord extends AbstractModel {

    /**
    * Status. `disable`: Blocked; `enable`: Unblocked.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Corresponding URL
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RealUrl")
    @Expose
    private String RealUrl;

    /**
    * Creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Status. `disable`: Blocked; `enable`: Unblocked.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Status Status. `disable`: Blocked; `enable`: Unblocked.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status. `disable`: Blocked; `enable`: Unblocked.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Status Status. `disable`: Blocked; `enable`: Unblocked.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Corresponding URL
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RealUrl Corresponding URL
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRealUrl() {
        return this.RealUrl;
    }

    /**
     * Set Corresponding URL
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RealUrl Corresponding URL
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRealUrl(String RealUrl) {
        this.RealUrl = RealUrl;
    }

    /**
     * Get Creation time
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CreateTime Creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CreateTime Creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return UpdateTime Update time.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param UpdateTime Update time.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public UrlRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UrlRecord(UrlRecord source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RealUrl != null) {
            this.RealUrl = new String(source.RealUrl);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RealUrl", this.RealUrl);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

