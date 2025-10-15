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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SQLContentActionResult extends AbstractModel {

    /**
    * Whether the operation is successful


    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * Folder ID.


    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
     * Get Whether the operation is successful

 
     * @return Status Whether the operation is successful


     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Whether the operation is successful


     * @param Status Whether the operation is successful


     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get Folder ID.

 
     * @return FolderId Folder ID.


     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder ID.


     * @param FolderId Folder ID.


     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    public SQLContentActionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SQLContentActionResult(SQLContentActionResult source) {
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);

    }
}

