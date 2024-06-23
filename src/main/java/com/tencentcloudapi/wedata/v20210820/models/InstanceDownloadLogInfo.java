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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceDownloadLogInfo extends AbstractModel {

    /**
    * File NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File URL
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
     * Get File NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return FileName File NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set File NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param FileName File NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File URL
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FileUrl File URL
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set File URL
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FileUrl File URL
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    public InstanceDownloadLogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceDownloadLogInfo(InstanceDownloadLogInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);

    }
}

