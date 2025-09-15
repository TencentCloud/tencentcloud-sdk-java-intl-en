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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiffDetail extends AbstractModel {

    /**
    * Tab page header.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Number of change items.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Detailed data to be rendered.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Rows")
    @Expose
    private DiffDetailItem [] Rows;

    /**
    * Header information to be rendered.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Header")
    @Expose
    private DiffHeader [] Header;

    /**
     * Get Tab page header. 
     * @return Name Tab page header.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Tab page header.
     * @param Name Tab page header.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Number of change items. 
     * @return Count Number of change items.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of change items.
     * @param Count Number of change items.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Detailed data to be rendered.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Rows Detailed data to be rendered.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DiffDetailItem [] getRows() {
        return this.Rows;
    }

    /**
     * Set Detailed data to be rendered.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Rows Detailed data to be rendered.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRows(DiffDetailItem [] Rows) {
        this.Rows = Rows;
    }

    /**
     * Get Header information to be rendered.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Header Header information to be rendered.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DiffHeader [] getHeader() {
        return this.Header;
    }

    /**
     * Set Header information to be rendered.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Header Header information to be rendered.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHeader(DiffHeader [] Header) {
        this.Header = Header;
    }

    public DiffDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiffDetail(DiffDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Rows != null) {
            this.Rows = new DiffDetailItem[source.Rows.length];
            for (int i = 0; i < source.Rows.length; i++) {
                this.Rows[i] = new DiffDetailItem(source.Rows[i]);
            }
        }
        if (source.Header != null) {
            this.Header = new DiffHeader[source.Header.length];
            for (int i = 0; i < source.Header.length; i++) {
                this.Header[i] = new DiffHeader(source.Header[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "Rows.", this.Rows);
        this.setParamArrayObj(map, prefix + "Header.", this.Header);

    }
}

