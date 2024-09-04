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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLogExportRequest extends AbstractModel {

    /**
    * Task ID of exported logs
    */
    @SerializedName("ExportId")
    @Expose
    private String ExportId;

    /**
     * Get Task ID of exported logs 
     * @return ExportId Task ID of exported logs
     */
    public String getExportId() {
        return this.ExportId;
    }

    /**
     * Set Task ID of exported logs
     * @param ExportId Task ID of exported logs
     */
    public void setExportId(String ExportId) {
        this.ExportId = ExportId;
    }

    public DeleteLogExportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLogExportRequest(DeleteLogExportRequest source) {
        if (source.ExportId != null) {
            this.ExportId = new String(source.ExportId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExportId", this.ExportId);

    }
}
