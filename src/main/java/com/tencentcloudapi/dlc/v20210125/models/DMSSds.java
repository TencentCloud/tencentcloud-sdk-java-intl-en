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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DMSSds extends AbstractModel {

    /**
    * Storage address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Input format
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InputFormat")
    @Expose
    private String InputFormat;

    /**
    * Output format
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputFormat")
    @Expose
    private String OutputFormat;

    /**
    * Number of buckets
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NumBuckets")
    @Expose
    private Long NumBuckets;

    /**
    * Whether it is compressed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Compressed")
    @Expose
    private Boolean Compressed;

    /**
    * Whether it has a subdirectory
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StoredAsSubDirectories")
    @Expose
    private Boolean StoredAsSubDirectories;

    /**
    * Serialization lib
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SerdeLib")
    @Expose
    private String SerdeLib;

    /**
    * Serialization name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SerdeName")
    @Expose
    private String SerdeName;

    /**
    * Bucket name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BucketCols")
    @Expose
    private String [] BucketCols;

    /**
    * Serialization parameters
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SerdeParams")
    @Expose
    private KVPair [] SerdeParams;

    /**
    * Additional Parameters
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Params")
    @Expose
    private KVPair [] Params;

    /**
    * Column sorting (Expired)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SortCols")
    @Expose
    private DMSColumnOrder SortCols;

    /**
    * Column
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cols")
    @Expose
    private DMSColumn [] Cols;

    /**
    * Column sorting field
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SortColumns")
    @Expose
    private DMSColumnOrder [] SortColumns;

    /**
     * Get Storage address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Location Storage address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Storage address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Location Storage address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Input format
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InputFormat Input format
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInputFormat() {
        return this.InputFormat;
    }

    /**
     * Set Input format
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InputFormat Input format
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInputFormat(String InputFormat) {
        this.InputFormat = InputFormat;
    }

    /**
     * Get Output format
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OutputFormat Output format
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOutputFormat() {
        return this.OutputFormat;
    }

    /**
     * Set Output format
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OutputFormat Output format
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutputFormat(String OutputFormat) {
        this.OutputFormat = OutputFormat;
    }

    /**
     * Get Number of buckets
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NumBuckets Number of buckets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNumBuckets() {
        return this.NumBuckets;
    }

    /**
     * Set Number of buckets
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NumBuckets Number of buckets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNumBuckets(Long NumBuckets) {
        this.NumBuckets = NumBuckets;
    }

    /**
     * Get Whether it is compressed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Compressed Whether it is compressed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getCompressed() {
        return this.Compressed;
    }

    /**
     * Set Whether it is compressed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Compressed Whether it is compressed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompressed(Boolean Compressed) {
        this.Compressed = Compressed;
    }

    /**
     * Get Whether it has a subdirectory
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StoredAsSubDirectories Whether it has a subdirectory
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getStoredAsSubDirectories() {
        return this.StoredAsSubDirectories;
    }

    /**
     * Set Whether it has a subdirectory
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StoredAsSubDirectories Whether it has a subdirectory
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStoredAsSubDirectories(Boolean StoredAsSubDirectories) {
        this.StoredAsSubDirectories = StoredAsSubDirectories;
    }

    /**
     * Get Serialization lib
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SerdeLib Serialization lib
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSerdeLib() {
        return this.SerdeLib;
    }

    /**
     * Set Serialization lib
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SerdeLib Serialization lib
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSerdeLib(String SerdeLib) {
        this.SerdeLib = SerdeLib;
    }

    /**
     * Get Serialization name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SerdeName Serialization name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSerdeName() {
        return this.SerdeName;
    }

    /**
     * Set Serialization name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SerdeName Serialization name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSerdeName(String SerdeName) {
        this.SerdeName = SerdeName;
    }

    /**
     * Get Bucket name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BucketCols Bucket name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getBucketCols() {
        return this.BucketCols;
    }

    /**
     * Set Bucket name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BucketCols Bucket name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBucketCols(String [] BucketCols) {
        this.BucketCols = BucketCols;
    }

    /**
     * Get Serialization parameters
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SerdeParams Serialization parameters
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public KVPair [] getSerdeParams() {
        return this.SerdeParams;
    }

    /**
     * Set Serialization parameters
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SerdeParams Serialization parameters
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSerdeParams(KVPair [] SerdeParams) {
        this.SerdeParams = SerdeParams;
    }

    /**
     * Get Additional Parameters
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Params Additional Parameters
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public KVPair [] getParams() {
        return this.Params;
    }

    /**
     * Set Additional Parameters
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Params Additional Parameters
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParams(KVPair [] Params) {
        this.Params = Params;
    }

    /**
     * Get Column sorting (Expired)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SortCols Column sorting (Expired)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DMSColumnOrder getSortCols() {
        return this.SortCols;
    }

    /**
     * Set Column sorting (Expired)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SortCols Column sorting (Expired)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSortCols(DMSColumnOrder SortCols) {
        this.SortCols = SortCols;
    }

    /**
     * Get Column
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Cols Column
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DMSColumn [] getCols() {
        return this.Cols;
    }

    /**
     * Set Column
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Cols Column
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCols(DMSColumn [] Cols) {
        this.Cols = Cols;
    }

    /**
     * Get Column sorting field
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SortColumns Column sorting field
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DMSColumnOrder [] getSortColumns() {
        return this.SortColumns;
    }

    /**
     * Set Column sorting field
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SortColumns Column sorting field
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSortColumns(DMSColumnOrder [] SortColumns) {
        this.SortColumns = SortColumns;
    }

    public DMSSds() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DMSSds(DMSSds source) {
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.InputFormat != null) {
            this.InputFormat = new String(source.InputFormat);
        }
        if (source.OutputFormat != null) {
            this.OutputFormat = new String(source.OutputFormat);
        }
        if (source.NumBuckets != null) {
            this.NumBuckets = new Long(source.NumBuckets);
        }
        if (source.Compressed != null) {
            this.Compressed = new Boolean(source.Compressed);
        }
        if (source.StoredAsSubDirectories != null) {
            this.StoredAsSubDirectories = new Boolean(source.StoredAsSubDirectories);
        }
        if (source.SerdeLib != null) {
            this.SerdeLib = new String(source.SerdeLib);
        }
        if (source.SerdeName != null) {
            this.SerdeName = new String(source.SerdeName);
        }
        if (source.BucketCols != null) {
            this.BucketCols = new String[source.BucketCols.length];
            for (int i = 0; i < source.BucketCols.length; i++) {
                this.BucketCols[i] = new String(source.BucketCols[i]);
            }
        }
        if (source.SerdeParams != null) {
            this.SerdeParams = new KVPair[source.SerdeParams.length];
            for (int i = 0; i < source.SerdeParams.length; i++) {
                this.SerdeParams[i] = new KVPair(source.SerdeParams[i]);
            }
        }
        if (source.Params != null) {
            this.Params = new KVPair[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new KVPair(source.Params[i]);
            }
        }
        if (source.SortCols != null) {
            this.SortCols = new DMSColumnOrder(source.SortCols);
        }
        if (source.Cols != null) {
            this.Cols = new DMSColumn[source.Cols.length];
            for (int i = 0; i < source.Cols.length; i++) {
                this.Cols[i] = new DMSColumn(source.Cols[i]);
            }
        }
        if (source.SortColumns != null) {
            this.SortColumns = new DMSColumnOrder[source.SortColumns.length];
            for (int i = 0; i < source.SortColumns.length; i++) {
                this.SortColumns[i] = new DMSColumnOrder(source.SortColumns[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "InputFormat", this.InputFormat);
        this.setParamSimple(map, prefix + "OutputFormat", this.OutputFormat);
        this.setParamSimple(map, prefix + "NumBuckets", this.NumBuckets);
        this.setParamSimple(map, prefix + "Compressed", this.Compressed);
        this.setParamSimple(map, prefix + "StoredAsSubDirectories", this.StoredAsSubDirectories);
        this.setParamSimple(map, prefix + "SerdeLib", this.SerdeLib);
        this.setParamSimple(map, prefix + "SerdeName", this.SerdeName);
        this.setParamArraySimple(map, prefix + "BucketCols.", this.BucketCols);
        this.setParamArrayObj(map, prefix + "SerdeParams.", this.SerdeParams);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamObj(map, prefix + "SortCols.", this.SortCols);
        this.setParamArrayObj(map, prefix + "Cols.", this.Cols);
        this.setParamArrayObj(map, prefix + "SortColumns.", this.SortColumns);

    }
}

