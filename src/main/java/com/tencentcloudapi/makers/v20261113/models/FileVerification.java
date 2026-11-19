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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileVerification extends AbstractModel {

    /**
    * <p>Verification file path</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>Verify file content</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get <p>Verification file path</p> 
     * @return Path <p>Verification file path</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>Verification file path</p>
     * @param Path <p>Verification file path</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>Verify file content</p> 
     * @return Content <p>Verify file content</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>Verify file content</p>
     * @param Content <p>Verify file content</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public FileVerification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileVerification(FileVerification source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

