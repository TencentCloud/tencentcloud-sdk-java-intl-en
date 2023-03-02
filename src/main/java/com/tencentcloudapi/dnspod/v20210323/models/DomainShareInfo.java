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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainShareInfo extends AbstractModel{

    /**
    * Account with which the domain is shared
    */
    @SerializedName("ShareTo")
    @Expose
    private String ShareTo;

    /**
    * Sharing mode. Valid values: `rw` (read/write), `r` (read-only).
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Sharing status. Valid values: `enabled` (shared successfully); `pending` (the account shared to does not exist and is pending registration).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Account with which the domain is shared 
     * @return ShareTo Account with which the domain is shared
     */
    public String getShareTo() {
        return this.ShareTo;
    }

    /**
     * Set Account with which the domain is shared
     * @param ShareTo Account with which the domain is shared
     */
    public void setShareTo(String ShareTo) {
        this.ShareTo = ShareTo;
    }

    /**
     * Get Sharing mode. Valid values: `rw` (read/write), `r` (read-only). 
     * @return Mode Sharing mode. Valid values: `rw` (read/write), `r` (read-only).
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Sharing mode. Valid values: `rw` (read/write), `r` (read-only).
     * @param Mode Sharing mode. Valid values: `rw` (read/write), `r` (read-only).
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Sharing status. Valid values: `enabled` (shared successfully); `pending` (the account shared to does not exist and is pending registration). 
     * @return Status Sharing status. Valid values: `enabled` (shared successfully); `pending` (the account shared to does not exist and is pending registration).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Sharing status. Valid values: `enabled` (shared successfully); `pending` (the account shared to does not exist and is pending registration).
     * @param Status Sharing status. Valid values: `enabled` (shared successfully); `pending` (the account shared to does not exist and is pending registration).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DomainShareInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainShareInfo(DomainShareInfo source) {
        if (source.ShareTo != null) {
            this.ShareTo = new String(source.ShareTo);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShareTo", this.ShareTo);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

