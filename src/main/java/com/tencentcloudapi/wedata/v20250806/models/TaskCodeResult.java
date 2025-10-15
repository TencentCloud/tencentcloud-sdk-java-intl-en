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

public class TaskCodeResult extends AbstractModel {

    /**
    * Code content.
    */
    @SerializedName("CodeInfo")
    @Expose
    private String CodeInfo;

    /**
    * Code file size. unit: KB.
    */
    @SerializedName("CodeFileSize")
    @Expose
    private String CodeFileSize;

    /**
     * Get Code content. 
     * @return CodeInfo Code content.
     */
    public String getCodeInfo() {
        return this.CodeInfo;
    }

    /**
     * Set Code content.
     * @param CodeInfo Code content.
     */
    public void setCodeInfo(String CodeInfo) {
        this.CodeInfo = CodeInfo;
    }

    /**
     * Get Code file size. unit: KB. 
     * @return CodeFileSize Code file size. unit: KB.
     */
    public String getCodeFileSize() {
        return this.CodeFileSize;
    }

    /**
     * Set Code file size. unit: KB.
     * @param CodeFileSize Code file size. unit: KB.
     */
    public void setCodeFileSize(String CodeFileSize) {
        this.CodeFileSize = CodeFileSize;
    }

    public TaskCodeResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskCodeResult(TaskCodeResult source) {
        if (source.CodeInfo != null) {
            this.CodeInfo = new String(source.CodeInfo);
        }
        if (source.CodeFileSize != null) {
            this.CodeFileSize = new String(source.CodeFileSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CodeInfo", this.CodeInfo);
        this.setParamSimple(map, prefix + "CodeFileSize", this.CodeFileSize);

    }
}

