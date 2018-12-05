package soot.options;

/*-
 * #%L
 * Soot - a J*va Optimization Framework
 * %%
 * Copyright (C) 2003 Ondrej Lhotak
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */

/* THIS FILE IS AUTO-GENERATED FROM soot_options.xml. DO NOT MODIFY. */

import java.util.*;

/** Option parser for Purity Analysis [AM]. */
@javax.annotation.Generated(value = "Saxonica v3.0", date = "2018-08-13T11:30:57.578+02:00", comments = "from soot_options.xml")
public class PurityOptions {

    private Map<String, String> options;

    public PurityOptions(Map<String, String> options) {
        this.options = options;
    }

    /**
     * Enabled
     */
    public boolean enabled() {
        return soot.PhaseOptions.getBoolean(options, "enabled");
    }

    /**
     * Dump one .dot files for each method summary
     */
    public boolean dump_summaries() {
        return soot.PhaseOptions.getBoolean(options, "dump-summaries");
    }

    /**
     * Dump .dot call-graph annotated with method summaries (huge)
     */
    public boolean dump_cg() {
        return soot.PhaseOptions.getBoolean(options, "dump-cg");
    }

    /**
     * Dump one .dot for each intra-procedural method analysis (long)
     */
    public boolean dump_intra() {
        return soot.PhaseOptions.getBoolean(options, "dump-intra");
    }

    /**
     * Print analysis results
     */
    public boolean print() {
        return soot.PhaseOptions.getBoolean(options, "print");
    }

    /**
     * Annotate class files --
     * Marks pure methods with a purity bytecode attribute.
     *
     */
    public boolean annotate() {
        return soot.PhaseOptions.getBoolean(options, "annotate");
    }

    /**
     * Be (quite) verbose
     */
    public boolean verbose() {
        return soot.PhaseOptions.getBoolean(options, "verbose");
    }

}
