/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.migrationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DisassociateDiscoveredResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateDiscoveredResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     */
    private String progressUpdateStream;
    /**
     * <p>
     * The identifier given to the MigrationTask.
     * </p>
     */
    private String migrationTaskName;
    /**
     * <p>
     * ConfigurationId of the ADS resource to be disassociated.
     * </p>
     */
    private String configurationId;
    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * 
     * @param progressUpdateStream
     *        The name of the ProgressUpdateStream.
     */

    public void setProgressUpdateStream(String progressUpdateStream) {
        this.progressUpdateStream = progressUpdateStream;
    }

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * 
     * @return The name of the ProgressUpdateStream.
     */

    public String getProgressUpdateStream() {
        return this.progressUpdateStream;
    }

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * 
     * @param progressUpdateStream
     *        The name of the ProgressUpdateStream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateDiscoveredResourceRequest withProgressUpdateStream(String progressUpdateStream) {
        setProgressUpdateStream(progressUpdateStream);
        return this;
    }

    /**
     * <p>
     * The identifier given to the MigrationTask.
     * </p>
     * 
     * @param migrationTaskName
     *        The identifier given to the MigrationTask.
     */

    public void setMigrationTaskName(String migrationTaskName) {
        this.migrationTaskName = migrationTaskName;
    }

    /**
     * <p>
     * The identifier given to the MigrationTask.
     * </p>
     * 
     * @return The identifier given to the MigrationTask.
     */

    public String getMigrationTaskName() {
        return this.migrationTaskName;
    }

    /**
     * <p>
     * The identifier given to the MigrationTask.
     * </p>
     * 
     * @param migrationTaskName
     *        The identifier given to the MigrationTask.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateDiscoveredResourceRequest withMigrationTaskName(String migrationTaskName) {
        setMigrationTaskName(migrationTaskName);
        return this;
    }

    /**
     * <p>
     * ConfigurationId of the ADS resource to be disassociated.
     * </p>
     * 
     * @param configurationId
     *        ConfigurationId of the ADS resource to be disassociated.
     */

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    /**
     * <p>
     * ConfigurationId of the ADS resource to be disassociated.
     * </p>
     * 
     * @return ConfigurationId of the ADS resource to be disassociated.
     */

    public String getConfigurationId() {
        return this.configurationId;
    }

    /**
     * <p>
     * ConfigurationId of the ADS resource to be disassociated.
     * </p>
     * 
     * @param configurationId
     *        ConfigurationId of the ADS resource to be disassociated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateDiscoveredResourceRequest withConfigurationId(String configurationId) {
        setConfigurationId(configurationId);
        return this;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     * 
     * @param dryRun
     *        Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has
     *        permission to make the call.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     * 
     * @return Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has
     *         permission to make the call.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     * 
     * @param dryRun
     *        Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has
     *        permission to make the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateDiscoveredResourceRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     * 
     * @return Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has
     *         permission to make the call.
     */

    public Boolean isDryRun() {
        return this.dryRun;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProgressUpdateStream() != null)
            sb.append("ProgressUpdateStream: ").append(getProgressUpdateStream()).append(",");
        if (getMigrationTaskName() != null)
            sb.append("MigrationTaskName: ").append(getMigrationTaskName()).append(",");
        if (getConfigurationId() != null)
            sb.append("ConfigurationId: ").append(getConfigurationId()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateDiscoveredResourceRequest == false)
            return false;
        DisassociateDiscoveredResourceRequest other = (DisassociateDiscoveredResourceRequest) obj;
        if (other.getProgressUpdateStream() == null ^ this.getProgressUpdateStream() == null)
            return false;
        if (other.getProgressUpdateStream() != null && other.getProgressUpdateStream().equals(this.getProgressUpdateStream()) == false)
            return false;
        if (other.getMigrationTaskName() == null ^ this.getMigrationTaskName() == null)
            return false;
        if (other.getMigrationTaskName() != null && other.getMigrationTaskName().equals(this.getMigrationTaskName()) == false)
            return false;
        if (other.getConfigurationId() == null ^ this.getConfigurationId() == null)
            return false;
        if (other.getConfigurationId() != null && other.getConfigurationId().equals(this.getConfigurationId()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProgressUpdateStream() == null) ? 0 : getProgressUpdateStream().hashCode());
        hashCode = prime * hashCode + ((getMigrationTaskName() == null) ? 0 : getMigrationTaskName().hashCode());
        hashCode = prime * hashCode + ((getConfigurationId() == null) ? 0 : getConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateDiscoveredResourceRequest clone() {
        return (DisassociateDiscoveredResourceRequest) super.clone();
    }

}
