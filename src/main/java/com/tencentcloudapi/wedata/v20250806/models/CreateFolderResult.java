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

public class CreateFolderResult extends AbstractModel {

    /**
    * Folder ID upon successful creation. error will be reported if creation failed.
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
     * Get Folder ID upon successful creation. error will be reported if creation failed. 
     * @return FolderId Folder ID upon successful creation. error will be reported if creation failed.
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder ID upon successful creation. error will be reported if creation failed.
     * @param FolderId Folder ID upon successful creation. error will be reported if creation failed.
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    public CreateFolderResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFolderResult(CreateFolderResult source) {
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);

    }
}

