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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndexInfo extends AbstractModel {

    /**
    * Index name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdxName")
    @Expose
    private String IdxName;

    /**
    * Column name for creating the index
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * Index type:
INVERTED: inverted index
NGRAM_BF: N-Gram index

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdxType")
    @Expose
    private String IdxType;

    /**
    * Index attributes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdxProperties")
    @Expose
    private Property [] IdxProperties;

    /**
    * Index description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdxComment")
    @Expose
    private String IdxComment;

    /**
     * Get Index name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IdxName Index name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIdxName() {
        return this.IdxName;
    }

    /**
     * Set Index name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IdxName Index name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIdxName(String IdxName) {
        this.IdxName = IdxName;
    }

    /**
     * Get Column name for creating the index
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ColumnName Column name for creating the index
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getColumnName() {
        return this.ColumnName;
    }

    /**
     * Set Column name for creating the index
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ColumnName Column name for creating the index
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    /**
     * Get Index type:
INVERTED: inverted index
NGRAM_BF: N-Gram index

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IdxType Index type:
INVERTED: inverted index
NGRAM_BF: N-Gram index

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIdxType() {
        return this.IdxType;
    }

    /**
     * Set Index type:
INVERTED: inverted index
NGRAM_BF: N-Gram index

Note: This field may return null, indicating that no valid values can be obtained.
     * @param IdxType Index type:
INVERTED: inverted index
NGRAM_BF: N-Gram index

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIdxType(String IdxType) {
        this.IdxType = IdxType;
    }

    /**
     * Get Index attributes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IdxProperties Index attributes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Property [] getIdxProperties() {
        return this.IdxProperties;
    }

    /**
     * Set Index attributes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IdxProperties Index attributes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIdxProperties(Property [] IdxProperties) {
        this.IdxProperties = IdxProperties;
    }

    /**
     * Get Index description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IdxComment Index description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIdxComment() {
        return this.IdxComment;
    }

    /**
     * Set Index description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IdxComment Index description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIdxComment(String IdxComment) {
        this.IdxComment = IdxComment;
    }

    public IndexInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndexInfo(IndexInfo source) {
        if (source.IdxName != null) {
            this.IdxName = new String(source.IdxName);
        }
        if (source.ColumnName != null) {
            this.ColumnName = new String(source.ColumnName);
        }
        if (source.IdxType != null) {
            this.IdxType = new String(source.IdxType);
        }
        if (source.IdxProperties != null) {
            this.IdxProperties = new Property[source.IdxProperties.length];
            for (int i = 0; i < source.IdxProperties.length; i++) {
                this.IdxProperties[i] = new Property(source.IdxProperties[i]);
            }
        }
        if (source.IdxComment != null) {
            this.IdxComment = new String(source.IdxComment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdxName", this.IdxName);
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamSimple(map, prefix + "IdxType", this.IdxType);
        this.setParamArrayObj(map, prefix + "IdxProperties.", this.IdxProperties);
        this.setParamSimple(map, prefix + "IdxComment", this.IdxComment);

    }
}

