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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackgroundImage extends AbstractModel {

    /**
    * ID of the COS file.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("COSFileId")
    @Expose
    private String COSFileId;

    /**
    * Download URL.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * Name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Creation time.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get ID of the COS file.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return COSFileId ID of the COS file.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCOSFileId() {
        return this.COSFileId;
    }

    /**
     * Set ID of the COS file.Note: This field may return null, indicating that no valid values can be obtained.
     * @param COSFileId ID of the COS file.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCOSFileId(String COSFileId) {
        this.COSFileId = COSFileId;
    }

    /**
     * Get Download URL.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return URL Download URL.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set Download URL.Note: This field may return null, indicating that no valid values can be obtained.
     * @param URL Download URL.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get Name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Creation time.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public BackgroundImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackgroundImage(BackgroundImage source) {
        if (source.COSFileId != null) {
            this.COSFileId = new String(source.COSFileId);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "COSFileId", this.COSFileId);
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

