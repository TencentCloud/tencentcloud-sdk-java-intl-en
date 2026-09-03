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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataConfig extends AbstractModel {

    /**
    * Mapping path.
    */
    @SerializedName("MappingPath")
    @Expose
    private String MappingPath;

    /**
    * Storage purpose.
Valid values: BUILTIN_CODE, BUILTIN_DATA, BUILTIN_MODEL, USER_DATA, USER_CODE, USER_MODEL, OUTPUT, and OTHER.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataSourceUsage")
    @Expose
    private String DataSourceUsage;

    /**
    * DATASET, COS, CFS, CFSTurbo, GooseFSx, HDFS, and WEDATA_HDFS
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
    * Data from the data set.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataSetSource")
    @Expose
    private DataSetConfig DataSetSource;

    /**
    * Data from COS.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("COSSource")
    @Expose
    private CosPathInfo COSSource;

    /**
    * Data from CFS.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CFSSource")
    @Expose
    private CFSConfig CFSSource;

    /**
    * Data from HDFS.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HDFSSource")
    @Expose
    private HDFSConfig HDFSSource;

    /**
    * GooseFS data.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GooseFSSource")
    @Expose
    private GooseFS GooseFSSource;

    /**
    * TurboFS data.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CFSTurboSource")
    @Expose
    private CFSTurbo CFSTurboSource;

    /**
    * Information from local disks.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LocalDiskSource")
    @Expose
    private LocalDisk LocalDiskSource;

    /**
    * CBS configuration information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CBSSource")
    @Expose
    private CBSConfig CBSSource;

    /**
    * Host path information.
    */
    @SerializedName("HostPathSource")
    @Expose
    private HostPath HostPathSource;

    /**
    * 
    */
    @SerializedName("PublicDataSource")
    @Expose
    private PublicDataSourceFS PublicDataSource;

    /**
     * Get Mapping path. 
     * @return MappingPath Mapping path.
     */
    public String getMappingPath() {
        return this.MappingPath;
    }

    /**
     * Set Mapping path.
     * @param MappingPath Mapping path.
     */
    public void setMappingPath(String MappingPath) {
        this.MappingPath = MappingPath;
    }

    /**
     * Get Storage purpose.
Valid values: BUILTIN_CODE, BUILTIN_DATA, BUILTIN_MODEL, USER_DATA, USER_CODE, USER_MODEL, OUTPUT, and OTHER.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataSourceUsage Storage purpose.
Valid values: BUILTIN_CODE, BUILTIN_DATA, BUILTIN_MODEL, USER_DATA, USER_CODE, USER_MODEL, OUTPUT, and OTHER.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataSourceUsage() {
        return this.DataSourceUsage;
    }

    /**
     * Set Storage purpose.
Valid values: BUILTIN_CODE, BUILTIN_DATA, BUILTIN_MODEL, USER_DATA, USER_CODE, USER_MODEL, OUTPUT, and OTHER.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataSourceUsage Storage purpose.
Valid values: BUILTIN_CODE, BUILTIN_DATA, BUILTIN_MODEL, USER_DATA, USER_CODE, USER_MODEL, OUTPUT, and OTHER.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataSourceUsage(String DataSourceUsage) {
        this.DataSourceUsage = DataSourceUsage;
    }

    /**
     * Get DATASET, COS, CFS, CFSTurbo, GooseFSx, HDFS, and WEDATA_HDFS
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataSourceType DATASET, COS, CFS, CFSTurbo, GooseFSx, HDFS, and WEDATA_HDFS
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set DATASET, COS, CFS, CFSTurbo, GooseFSx, HDFS, and WEDATA_HDFS
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataSourceType DATASET, COS, CFS, CFSTurbo, GooseFSx, HDFS, and WEDATA_HDFS
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
    }

    /**
     * Get Data from the data set.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataSetSource Data from the data set.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DataSetConfig getDataSetSource() {
        return this.DataSetSource;
    }

    /**
     * Set Data from the data set.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataSetSource Data from the data set.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataSetSource(DataSetConfig DataSetSource) {
        this.DataSetSource = DataSetSource;
    }

    /**
     * Get Data from COS.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return COSSource Data from COS.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CosPathInfo getCOSSource() {
        return this.COSSource;
    }

    /**
     * Set Data from COS.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param COSSource Data from COS.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCOSSource(CosPathInfo COSSource) {
        this.COSSource = COSSource;
    }

    /**
     * Get Data from CFS.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CFSSource Data from CFS.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CFSConfig getCFSSource() {
        return this.CFSSource;
    }

    /**
     * Set Data from CFS.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CFSSource Data from CFS.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCFSSource(CFSConfig CFSSource) {
        this.CFSSource = CFSSource;
    }

    /**
     * Get Data from HDFS.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HDFSSource Data from HDFS.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public HDFSConfig getHDFSSource() {
        return this.HDFSSource;
    }

    /**
     * Set Data from HDFS.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HDFSSource Data from HDFS.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHDFSSource(HDFSConfig HDFSSource) {
        this.HDFSSource = HDFSSource;
    }

    /**
     * Get GooseFS data.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GooseFSSource GooseFS data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public GooseFS getGooseFSSource() {
        return this.GooseFSSource;
    }

    /**
     * Set GooseFS data.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GooseFSSource GooseFS data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGooseFSSource(GooseFS GooseFSSource) {
        this.GooseFSSource = GooseFSSource;
    }

    /**
     * Get TurboFS data.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CFSTurboSource TurboFS data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CFSTurbo getCFSTurboSource() {
        return this.CFSTurboSource;
    }

    /**
     * Set TurboFS data.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CFSTurboSource TurboFS data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCFSTurboSource(CFSTurbo CFSTurboSource) {
        this.CFSTurboSource = CFSTurboSource;
    }

    /**
     * Get Information from local disks.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LocalDiskSource Information from local disks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LocalDisk getLocalDiskSource() {
        return this.LocalDiskSource;
    }

    /**
     * Set Information from local disks.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LocalDiskSource Information from local disks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocalDiskSource(LocalDisk LocalDiskSource) {
        this.LocalDiskSource = LocalDiskSource;
    }

    /**
     * Get CBS configuration information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CBSSource CBS configuration information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CBSConfig getCBSSource() {
        return this.CBSSource;
    }

    /**
     * Set CBS configuration information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CBSSource CBS configuration information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCBSSource(CBSConfig CBSSource) {
        this.CBSSource = CBSSource;
    }

    /**
     * Get Host path information. 
     * @return HostPathSource Host path information.
     */
    public HostPath getHostPathSource() {
        return this.HostPathSource;
    }

    /**
     * Set Host path information.
     * @param HostPathSource Host path information.
     */
    public void setHostPathSource(HostPath HostPathSource) {
        this.HostPathSource = HostPathSource;
    }

    /**
     * Get  
     * @return PublicDataSource 
     */
    public PublicDataSourceFS getPublicDataSource() {
        return this.PublicDataSource;
    }

    /**
     * Set 
     * @param PublicDataSource 
     */
    public void setPublicDataSource(PublicDataSourceFS PublicDataSource) {
        this.PublicDataSource = PublicDataSource;
    }

    public DataConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataConfig(DataConfig source) {
        if (source.MappingPath != null) {
            this.MappingPath = new String(source.MappingPath);
        }
        if (source.DataSourceUsage != null) {
            this.DataSourceUsage = new String(source.DataSourceUsage);
        }
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
        if (source.DataSetSource != null) {
            this.DataSetSource = new DataSetConfig(source.DataSetSource);
        }
        if (source.COSSource != null) {
            this.COSSource = new CosPathInfo(source.COSSource);
        }
        if (source.CFSSource != null) {
            this.CFSSource = new CFSConfig(source.CFSSource);
        }
        if (source.HDFSSource != null) {
            this.HDFSSource = new HDFSConfig(source.HDFSSource);
        }
        if (source.GooseFSSource != null) {
            this.GooseFSSource = new GooseFS(source.GooseFSSource);
        }
        if (source.CFSTurboSource != null) {
            this.CFSTurboSource = new CFSTurbo(source.CFSTurboSource);
        }
        if (source.LocalDiskSource != null) {
            this.LocalDiskSource = new LocalDisk(source.LocalDiskSource);
        }
        if (source.CBSSource != null) {
            this.CBSSource = new CBSConfig(source.CBSSource);
        }
        if (source.HostPathSource != null) {
            this.HostPathSource = new HostPath(source.HostPathSource);
        }
        if (source.PublicDataSource != null) {
            this.PublicDataSource = new PublicDataSourceFS(source.PublicDataSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MappingPath", this.MappingPath);
        this.setParamSimple(map, prefix + "DataSourceUsage", this.DataSourceUsage);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamObj(map, prefix + "DataSetSource.", this.DataSetSource);
        this.setParamObj(map, prefix + "COSSource.", this.COSSource);
        this.setParamObj(map, prefix + "CFSSource.", this.CFSSource);
        this.setParamObj(map, prefix + "HDFSSource.", this.HDFSSource);
        this.setParamObj(map, prefix + "GooseFSSource.", this.GooseFSSource);
        this.setParamObj(map, prefix + "CFSTurboSource.", this.CFSTurboSource);
        this.setParamObj(map, prefix + "LocalDiskSource.", this.LocalDiskSource);
        this.setParamObj(map, prefix + "CBSSource.", this.CBSSource);
        this.setParamObj(map, prefix + "HostPathSource.", this.HostPathSource);
        this.setParamObj(map, prefix + "PublicDataSource.", this.PublicDataSource);

    }
}

