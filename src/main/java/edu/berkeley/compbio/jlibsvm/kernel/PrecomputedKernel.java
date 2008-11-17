package edu.berkeley.compbio.jlibsvm.kernel;

import edu.berkeley.compbio.jlibsvm.SvmPoint;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Properties;

/**
 * @author <a href="mailto:dev@davidsoergel.com">David Soergel</a>
 * @version $Id$
 */
public class PrecomputedKernel implements KernelFunction
	{
	public PrecomputedKernel(Properties props)
		{
		throw new NotImplementedException(); //"Hmm, not sure how to load precomputed kernels");
		}

	public PrecomputedKernel()
		{
		throw new NotImplementedException();
		}

	public float evaluate(SvmPoint x, SvmPoint y)
		{
		return x.values[(int) (y.values[0])];
		}

	public String toString()
		{
		StringBuilder sb = new StringBuilder();
		sb.append("kernel_type precomputed\n");
		return sb.toString();
		}

	public String perfString()
		{
		return "";
		}
	}